import java.applet.*;
import java.awt.*;
public class Demo extends Applet
{
 public void init()
 {
  setBackground (color.yellow);
 }
 public void paint(Graphics g)
 {
  g.drawLine(50,50,50,200);
  g.deawRect(100,50,250,150);
  g.drawString("Hello..",50,250);
 }
}