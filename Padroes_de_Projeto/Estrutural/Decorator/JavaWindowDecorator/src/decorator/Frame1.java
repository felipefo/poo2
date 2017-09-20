package decorator;

import sempadrao.JBorderLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame1 extends JFrame {

  JBorderLabel label1 =
    new JBorderLabel("Sem o padrão");//sem o padrao...
  BorderDecorator label2 =
    new BorderDecorator(new JLabel("Decorator JLabel"));
  BorderDecorator textArea = new BorderDecorator(
          new JTextArea("Decorator textArea"));

  public Frame1() {
    try {
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      getContentPane().setLayout(null);
      label1.setBounds(new Rectangle(10, 10, 120, 25));
      this.getContentPane().add(label1, null);
      label2.setBounds(new Rectangle(10, 60, 120, 25));
      this.getContentPane().add(label2, null);
      textArea.setBounds(new Rectangle(10, 110, 170, 40));
      this.getContentPane().add(textArea, null);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  public void iniciaComponentes(){
      
  }
  
  public static void main(String[] args) {
    Frame1 frame1 = new Frame1();
    frame1.setBounds(0, 0, 200, 200);
    frame1.setVisible(true);
  }

}