



import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Pedido {
        
    public ArrayList<Item> itens = new ArrayList();
    
    public void addItemPedido(Item item ){                        
        this.itens.add(item);
        
        
    }    
    
    
    
}
