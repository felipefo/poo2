package decorator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame2 extends JFrame {
  ResizableDecorator label1 =
    new ResizableDecorator(new JLabel("Resizable Decorator Label"));
  ResizableDecorator button1 =
    new ResizableDecorator(new JButton("Resizable Decorator Button"));
  BorderDecorator label2 =
    new BorderDecorator(new ResizableDecorator(
            new JLabel("Double decorator")));

  public Frame2() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
      
    Frame2 frame = new Frame2();
    frame.setBounds(0, 0, 200, 200);
    frame.setVisible(true);
  }

  private void jbInit() throws Exception {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setLayout(null);
    label1.setBounds(new Rectangle(10, 10, 120, 25));
    label2.setBounds(new Rectangle(10, 60, 120, 25));
    button1.setBounds(new Rectangle(10, 110, 120, 25));
    this.getContentPane().add(label1, null);
    this.getContentPane().add(label2, null);
    this.getContentPane().add(button1, null);
  }

}