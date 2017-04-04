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
public class Flores extends DecoracoesAdicionais {

   // Festa festa;

    public Flores(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Flores";
}
public double cost() {
        return 200 + festa.cost();
    }
}
