import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q329 extends MouseAdapter {
    JLabel l;
    Q329(){
        JFrame f = new JFrame("Lab");
        l = new JLabel();
        l.setBounds(100,100,100,100);
        f.add(l);
        f.addMouseListener(this);
        f.setLayout(null);
        f.setSize(300,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new Q329();
    }
}
