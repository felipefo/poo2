/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.file.csv;

import java.util.LinkedList;
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
public class MainReadCsvTest {
    
    public MainReadCsvTest() {
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
     * Test of main method, of class MainReadCsv.
     */
    @Test
    public void testMain() throws Exception {
        
       String[] args = null;
        
       LeCsv leitorCsv = new LeCsv();               
       LinkedList<Cliente> clientes = leitorCsv.leCsvClientes();
       TotalCompras compras = new TotalCompras();
       double total = compras.calculaSomaTotal(clientes);        
       assertEquals(total, 25000);
                
    }
    
}
