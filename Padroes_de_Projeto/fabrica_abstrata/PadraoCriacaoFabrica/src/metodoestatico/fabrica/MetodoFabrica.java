/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoestatico.fabrica;

/**
 *
 * @author felipe
 */
public class MetodoFabrica {

    public static void main(String[] args) {
        Formato formato;
        formato = FabricaFormato.geraFormato("metodofabrica.FormatoPng");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("metodofabrica.FormatoJpeg");
        formato.gera();
    }    
}

