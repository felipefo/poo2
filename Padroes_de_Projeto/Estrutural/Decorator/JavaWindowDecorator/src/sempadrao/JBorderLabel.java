package sempadrao;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.Icon;

public class JBorderLabel extends JLabel {

  public JBorderLabel() {
    super();
  }
  public JBorderLabel(String text) {
    super(text);
  }
  public JBorderLabel(Icon image) {
    super(image);
  }
  public JBorderLabel(String text, Icon image, int horizontalAlignment) {
    super(text, image, horizontalAlignment);
  }
  public JBorderLabel(String text, int horizontalAlignment) {
    super(text, horizontalAlignment);
  }
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int height = this.getHeight();
    int width = this.getWidth();
    g.drawRect(0, 0, width - 1, height - 1);
  }
}