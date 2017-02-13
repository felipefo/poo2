
package metodoestatico.fabrica;

public class FabricaFormato {
    public static Formato geraFormato(String classe){
        Formato formato;
        Object classeReflection = null;
	try {
            classeReflection = Class.forName(classe).newInstance();            
	    } catch (InstantiationException e) {
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
            e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}        
        formato = (Formato) classeReflection;
        return formato;
    }
    
    
}
