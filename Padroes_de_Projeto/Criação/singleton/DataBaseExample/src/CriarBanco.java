
import database.example.CreateTable;
import database.example.InsertRecord;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip_kja6gpn
 */
public class CriarBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreateTable criaTabela = new CreateTable();
        criaTabela.createTable();
    }
    
}
