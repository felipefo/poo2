


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author felipe
 */
public class FlyweightStatusItem {

    private static Map<StatusItem.Estado, StatusItem> mapa = null;
    
    private FlyweightStatusItem() {                
    }
    
    public static StatusItem get(StatusItem.Estado nome) {

        if (mapa == null) {
            mapa = new HashMap<>();
            mapa.put(StatusItem.Estado.CARRINHO, new StatusItem(StatusItem.Estado.CARRINHO, true, false));
            mapa.put(StatusItem.Estado.FECHADO, new StatusItem(StatusItem.Estado.FECHADO, true, false));
            mapa.put(StatusItem.Estado.PAGO, new StatusItem(StatusItem.Estado.PAGO, true, true));
            mapa.put(StatusItem.Estado.ENVIADO, new StatusItem(StatusItem.Estado.ENVIADO, false, true));
            mapa.put(StatusItem.Estado.ENTREGUE, new StatusItem(StatusItem.Estado.ENTREGUE, false, true));
        }
    
        if (!mapa.containsKey(nome)) {
            throw new RuntimeException("Status inexistente:" + nome);
        }
        return mapa.get(nome);
    }

}
