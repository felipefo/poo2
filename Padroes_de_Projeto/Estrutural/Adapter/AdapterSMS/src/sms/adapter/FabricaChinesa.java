
package sms.adapter;

import operacao.chinesa.EnvioSMSChinesa;

/**
 *
 * @author felipe
 */
public class FabricaChinesa extends FabricaAbstrataEnvios{ 

    @Override
    public  Cobranca criaCobranca() {
        return new CobrancaChinesa();
    }
    @Override
    public EnvioSMS criaEnvioSMS() {                
        return new AdapterSMSChines();             
    }
}

