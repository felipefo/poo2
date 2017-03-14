
package blog;

import java.io.Serializable;
import java.util.LinkedList;

public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
    public String nome;
    public String email;
    public String senha;
    public String apelido;
    public String telefone;
    public LinkedList<Post> publicacao = new LinkedList(); 

}
