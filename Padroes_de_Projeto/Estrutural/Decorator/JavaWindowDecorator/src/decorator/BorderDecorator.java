package decorator;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.BorderLayout;

public class BorderDecorator extends DecoratorAbstrato{
  
// decorated component  
public BorderDecorator(JComponent component) {
    child = component;
    this.setLayout(new BorderLayout());
    this.add(child);
  }

  public void paint(Graphics g) {
    super.paint(g);
    int height = this.getHeight();
    int width = this.getWidth();
    g.drawRect(0, 0, width-1 , height-1 );
  }
   

}