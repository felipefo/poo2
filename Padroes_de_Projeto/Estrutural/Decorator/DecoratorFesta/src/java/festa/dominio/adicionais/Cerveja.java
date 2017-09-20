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
public class Cerveja extends DecoracoesAdicionais {


    public Cerveja(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Cerveja";
}
public double cost() {
        return 500 + festa.cost();
    }
}
