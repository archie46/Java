import javax.swing.*;
import java.awt.event.*;
public class Q129 implements KeyListener {
    JTextField tf;
    JOptionPane o;
    @Override
    public void keyTyped(KeyEvent e) {
     //   System.out.println("You Typed");
         JOptionPane.showMessageDialog(o,"You Typed");
    }
    @Override
    public void keyPressed(KeyEvent e) {
      //  System.out.println("You Pressed");
          JOptionPane.showMessageDialog(o,"You Pressed");
    }
    @Override
    public void keyReleased(KeyEvent e) {
     //   System.out.println("You Released");
           JOptionPane.showMessageDialog(o,"You Released");
    }
    Q129(){
        JFrame f = new JFrame("Lab");
         o = new JOptionPane();
        tf = new JTextField();
        tf.setBounds(150,20,150,20);
        tf.addKeyListener(this);
        f.setLayout(null);
        f.add(tf);
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args) {
       new Q129();
    }

}
