/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization.exercicio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felip
 */
public class ExercicioBlogSerializadoTest {
    
    public ExercicioBlogSerializadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() throws Exception {
                
        Usuario user = new Usuario();
        user.setEmail("teste@teste.com");
        user.setNome("joao");
        user.setSenha("123456");
        
        Post post = new Post();
        post.setKeyWords("android,mobile");
        
        Blog blog = new Blog();
        blog.setCategoria("informatica");
        blog.setDescricao("Tudo sobre informatica");        
        blog.setPertence(user);        
        blog.addPost(post);
                
        SaveExercicioSerializado save = new SaveExercicioSerializado();
        save.save(blog);
        
        RecuperarExercicioSerializado rec = new RecuperarExercicioSerializado();
        Blog blogRecuperado = rec.recupera();
        
        assertEquals( blogRecuperado , blog);        
        
    }
    
}
