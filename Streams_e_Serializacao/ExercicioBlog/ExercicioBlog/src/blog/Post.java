
package blog;

import java.io.Serializable;


public class Post  implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String keyWords;
    private String conteudo;

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }
    
    
}
