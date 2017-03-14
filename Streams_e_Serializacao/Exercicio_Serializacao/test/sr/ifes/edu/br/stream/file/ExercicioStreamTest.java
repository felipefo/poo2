/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import sr.ifes.edu.br.stream.file.ArquivoFileStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe
 */
public class ExercicioStreamTest {

    public ExercicioStreamTest() {
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

    /**
     * Test of main method, of class ExercicioStream.
     */
    @Test
    public void testMain() throws Exception {
        
        System.out.println("main");
        String[] args = null;
        String current = new java.io.File(".").getCanonicalPath();
        String file = current + "\\src\\arquivo_saida.txt";
        Path path = FileSystems.getDefault().getPath(file);
        Files.deleteIfExists(path);

        ArquivoFileStream.main(args);
        FileReader in = new FileReader(file);
        BufferedReader reader = new BufferedReader(in);
        String line = reader.readLine();
        line = line.replaceAll("\n", "");
        line = line.replaceAll("\r", "");

        assertEquals(line, "arquivo de entrada saida");

        // TODO review the generated test code and remove the default call to fail.        
    }

}
