/*
 Adicional de Flores
 */
package festa.dominio.adicionais;

import festa.dominio.DecoracoesAdicionais;
import festa.dominio.Festa;

/**
 *
 * @author felipe
 */
public class AguadeCoco extends DecoracoesAdicionais {

    public AguadeCoco(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Agua de Coco";
}
public double cost() {
        return 200 + festa.cost();
    }
}
