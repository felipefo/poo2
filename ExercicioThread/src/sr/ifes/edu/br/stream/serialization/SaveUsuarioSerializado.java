/*
    Exercicios que mostra como ler um arquivo e salvar os dados de um arquivo em outro arquivo.
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.*;


public class SaveUsuarioSerializado {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        UsuarioSerializado usuarioSerializado = new UsuarioSerializado();
        usuarioSerializado.setEmail("joao@email.com");        
        usuarioSerializado.setNome("joao");
        usuarioSerializado.setSenha("password");
               
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "\\src\\usuario_serializado.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(usuarioSerializado);
        outputSerializado.close();
        
        System.out.println("Usuario Salvo");        
        System.out.println("Arquivo gerado em: " + current + 
                "\\src\\usuario_serializado.ser");
        
        
    }
}

   
