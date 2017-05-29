
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      ExportFiles export = new ExportFiles();
      export.exportHTML(texto);
      export.exportWord(texto);
    }
    
}
