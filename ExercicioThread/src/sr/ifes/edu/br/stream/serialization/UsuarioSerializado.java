/*
Exemplo de serializao de uma classe. Classe de dominio de usuario    
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.Serializable;


public class UsuarioSerializado implements Serializable{

    String nome;
    private String email;
    private String senha;   
   

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
   

}
