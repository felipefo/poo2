

package sms.adapter;

import operacao.chinesa.EnviadorSMS;
import operacao.chinesa.EnvioSMSChinesa;

/**
 *
 * @author felipe
 */
public class AdapterSMSChines implements EnvioSMS{

    EnviadorSMS envioChines = new EnvioSMSChinesa();
    
    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        String texto = msg.texto;
        String[] textoChines = new String[texto.length()];
        for(int i = 0; i < texto.length(); i++)
        {
            textoChines[i] = String.valueOf(texto.charAt(i));
        }        
        return envioChines.enviarSMS(String.valueOf(telefone),textoChines);        
    }
}


