package testeclonagem;

import javax.swing.*;

public class LeituraTeclado {

    public void leitura() {

        String resposta = "";        
        float[] nota = new float[4];
        float media = 0;
        float somaTotal=0;
        for(int indiceNotas=0; indiceNotas<nota.length; indiceNotas++){
            resposta = JOptionPane.showInputDialog("Entre com a nota ");                
            somaTotal += Float.parseFloat(resposta);            
        }                       
        media = (somaTotal)/ nota.length;
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado com média:" +media );
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }

}
