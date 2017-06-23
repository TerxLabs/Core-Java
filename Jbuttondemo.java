import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code = "Jbuttondemo.class" height=500 width=500></applet>*/

public class Jbuttondemo extends JApplet implements ActionListener
{
  JButton b1, b2, b3;
  JLabel l;

  public void init()
  {
    l = new JLabel("Select your color:");
    b1 = new JButton("Red");
    b1.addActionListener(this);
    b2 = new JButton("Blue");
    b2.addActionListener(this);
    b3 = new JButton("Green");
    b3.addActionListener(this);
    setLayout(new FlowLayout());
    add(l);
    add(b1);
    add(b2);
    add(b3);
  }
  public void actionPerformed (ActionEvent ae)
  {
    String S = ae.getActionCommand();
    if (S.equals("Red"))
      getContentPane().setBackground(Color.red);
    else if (S.equals("Blue"))
      getContentPane().setBackground(Color.blue);
    else if (S.equals("Green"))
      getContentPane().setBackground(Color.green);
  }
}
