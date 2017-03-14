
package blog;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Objects;


public class Blog implements Serializable{
 
    private static final long serialVersionUID = 1L;
    private String url;
    private String descricao;
    private String categoria;
    private Usuario pertence;
    private LinkedList<Post> tem = new LinkedList();

    public Usuario getPertence() {
        return pertence;
    }

    public void setPertence(Usuario pertence) {
        this.pertence = pertence;
    }

    public LinkedList<Post> getTem() {
        return tem;
    }

    public void addPost(Post post) {
        this.tem.add(post);
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Blog other = (Blog) obj;
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }

   
    
    public void setTem(LinkedList<Post> tem) {
        this.tem = tem;
    }
    

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
