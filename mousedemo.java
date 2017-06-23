import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code = "mousedemo.class" height = 500 width = 500></applet>*/
public class mousedemo extends Applet 
{
  String msg = " ";
  int x = 0;
  int y = 0;
  public void init()
  {
    addMouseListener(new myadapterdemo (this));
  }
  public void paint(Graphics g)
  {
    g.drawString(msg,x,y);
  }
}
  class myadapterdemo extends MouseAdapter
  {
    mousedemo m;
    myadapterdemo(mousedemo p)
    {
      m = p;
    }
    public void mouseClicked(MouseEvent me)
    {
      m.x = me.getX();
      m.y = me.getY();
      m.msg = "you clicked at: "+ m.x +","+ m.y;
      m.repaint();
    }
}
