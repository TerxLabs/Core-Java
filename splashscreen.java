import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class splashscreen extends JFrame
{
  JLabel l;
  public splashscreen()
  {
    setLayout(new FlowLayout());
    l = new JLabel("Welcome To Frame");
    add(l);
  }
  public static void main(String args[])
  {
    splashscreen s = new splashscreen();
    s.setSize(500,500);
    s.setVisible(true);
    try
    {
      Thread.sleep(3000);
    }
    catch(Exception e){}
      System.exit(0);
  }
