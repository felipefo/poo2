

package fabrica.abstrata;

import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.Cobranca;

/**
 *
 * @author felipe
 */
public abstract class FabricaAbstrataEnvios {        
    public abstract Cobranca criaCobranca();
    public abstract EnvioSMS criaEnvioSMS();
}
