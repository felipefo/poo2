/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.pattern;


import javax.swing.JButton;
import javax.swing.undo.UndoManager;

/**
 *
 * @author felipe
 */
public class Avancar extends JButton implements IBotaoComando  {

     private UndoManager  undo;
     
     public Avancar(UndoManager undo){
         this.undo = undo;
     }
     
     
     
     public void doAvancar(){
         if (undo.canRedo()){ 
          undo.redo(); 
      }        
     }

    @Override
    public void executar() {
       doAvancar();
    }
      
    
}
