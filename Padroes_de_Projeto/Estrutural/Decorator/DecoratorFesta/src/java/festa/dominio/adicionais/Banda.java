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
public class Banda extends DecoracoesAdicionais {

    //Festa festa;

    public Banda(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Banda";
}
public double cost() {
        return 1500 + festa.cost();
    }
}
