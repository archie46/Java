import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q306 implements ActionListener{
    JButton b1,b2;
    JFrame j;
    Q306(){
        j =  new JFrame();
        b1 = new JButton("Magenta");
        b2 = new JButton("Cyan");
        b1.setBounds(50,50,100,30);
        b2.setBounds(50,100,100,30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        j.add(b1);
        j.add(b2);
        j.setLayout(null);
        j.setSize(400,300);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
    public static void main(String[] args) {
           new Q306();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            j.getContentPane().setBackground(Color.magenta);
        }
        if(e.getSource()==b2){
            j.getContentPane().setBackground(Color.cyan);
        }

    }
}
