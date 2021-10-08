
package exemplo.fluent;

import exemplo.convencional.*;

/**
 *
 * @author felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.ComNome("Felipe")
                .ComSobreNome("Oliveira")
                .ComEmail("felipefo@gmail.com")
                .Habilitado();
    }
    
}
