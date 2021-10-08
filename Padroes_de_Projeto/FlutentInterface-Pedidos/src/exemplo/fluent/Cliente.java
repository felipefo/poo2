package exemplo.fluent;

import exemplo.convencional.*;

/**
 *
 * @author felipe
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String email;
    private boolean ativo;
    public Cliente ComNome(String nome) {
        this.nome = nome;
        return this;
    }
    public Cliente ComSobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }
     public Cliente ComEmail(String email) {
        this.email = email;
        return this;
    }
    public Cliente Habilitado() {
        this.ativo = true;
        return this;
    }
    public Cliente Desabilitado() {
        this.ativo = false;
        return this;
    }
     public String getNome() {
        return nome;
    }
     
    public String getSobrenome() {
        return sobrenome;
    }
    
    public String getEmail() {
        return email;
    }
 
      
    public boolean isAtivo() {
        return ativo;
    }

}
