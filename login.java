import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener
{
  JLabel l1,l2;
  JPasswordField p1;
  JTextField t1;
  JButton b1;
  JTextArea jt1;
  public login()
  {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //to close the entire Screen Application
    setTitle("Login Screen");
    setSize(500,500);
    setLayout(null);
    l1 = new JLabel("Username: ");
    l2 = new JLabel("Password: ");
    l1.setBounds(100,100,200,50);
    l2.setBounds(100,100,200,50);
    t1 = new JTextField(20);
    p1 = new JPasswordField(20);
    t1.setBounds(320,100,200,50);
    p1.setBounds(320,100,200,50);
    b1 = new JButton("LOGIN");
    b1.setBounds(200,300,150,50);
    b1.addActionListener(this);
    jt1 = new JTextArea(10,10);
    jt1.setBounds(150,370,300,300);
    add(l1);
    add(t1);
    add(l2);
    add(p1);
    add(b1);
    add(jt1);
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
      String u,p;
      u = t1.getText();
      p = p1.getText();
      if(u.equals("abc") && p.equals("abc"))
      {
        JOptionPane.showMessageDialog(null,"Login Sucessful");
        jt1.append("Username: "+u+"\n");
        jt1.append("Password: "+p+"\n");
      }
      else
        JOptionPane.showMessageDialog(null,"Login Unsucessful....Try Again");

    }
  }
  public static void main(String[] args)
  {
    login s = new login();
    s.setVisible(true);
  }
}
