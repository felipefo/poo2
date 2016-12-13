
package sr.ifes.edu.br.stream.serialization.exercicio;

import java.util.LinkedList;


public class Blog {

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
