/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.pattern;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.undo.UndoManager;

/**
 *
 * @author felipe
 */
public class Voltar extends JButton implements IBotaoComando {
    
    private UndoManager  undo;
    
    public Voltar(UndoManager  undo){                        
        this.undo = undo;
    }
    
    public void executar(){
        this.doVoltar();
    }
    
    public void doVoltar(){
        if (this.undo.canUndo()){
           this.undo.undo();
       }
    }
        
}
