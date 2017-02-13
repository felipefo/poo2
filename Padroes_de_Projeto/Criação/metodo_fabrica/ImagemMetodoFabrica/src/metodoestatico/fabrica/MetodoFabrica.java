
package metodoestatico.fabrica;


public class MetodoFabrica {

    public static void main(String[] args) {
        Formato formato;
        formato = FabricaFormato.geraFormato("metodofabrica.FormatoPng");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("metodofabrica.FormatoJpeg");
        formato.gera();
    }    
}

