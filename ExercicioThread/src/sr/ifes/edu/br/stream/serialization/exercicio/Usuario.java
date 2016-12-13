/*
    Exemplo de uma classe.
 */
package sr.ifes.edu.br.stream.serialization.exercicio;

import java.util.LinkedList;


public class Usuario{

    private String nome;
    private String email;
    private String senha;
    private String apelido;
    private String telefone;
    private LinkedList<Post> publica = new LinkedList(); 

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
