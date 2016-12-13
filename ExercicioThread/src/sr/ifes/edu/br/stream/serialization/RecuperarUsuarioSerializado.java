
package sr.ifes.edu.br.stream.serialization;


import java.io.*;

public class RecuperarUsuarioSerializado {

    public static void main(String[] args) throws Exception {
        {
            UsuarioSerializado user = null;

            String current = new java.io.File(".").getCanonicalPath();

            FileInputStream fileIn = new FileInputStream(current + 
                    "\\src\\usuario_serializado.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (UsuarioSerializado) in.readObject();
            in.close();

            System.out.println("Deserializando Usuario...");
            System.out.println("Nome: " + user.getNome());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Senha: " + user.getSenha());

        }
    }
}
