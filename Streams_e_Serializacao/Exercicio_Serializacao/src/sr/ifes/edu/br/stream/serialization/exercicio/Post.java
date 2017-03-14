/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization.exercicio;

import java.io.Serializable;

/**
 *
 * @author felip
 */
public class Post  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String keyWords;

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }
    
    
}
