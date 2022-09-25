import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q229 implements ItemListener  {
    JRadioButton r1,r2,r3;
    JLabel l1,l2,l3;
    Q229(){
        JFrame f = new JFrame("Lab");
         r1 = new JRadioButton("Red");
         l1 = new JLabel();
         r2 = new JRadioButton("Yellow");
         l2 = new JLabel();
         r3 = new JRadioButton("Green");
         l3 = new JLabel();
        l1.setBounds(100,25,150,50);
        r1.setBounds(100,100,150,50);
        l2.setBounds(100,175,150,50);
        r2.setBounds(100,250,150,50);
        l3.setBounds(100,325,150,50);
        r3.setBounds(100,400,150,50);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.setLayout(null);
        f.setSize(500,600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Q229();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(r1.isSelected()){
            l1.setForeground(Color.red);
            l1.setText("STOP");
            l2.setText(null);
            l3.setText(null);
        }
        if(r2.isSelected()){
            l2.setForeground(Color.yellow);
            l2.setText("READY");
            l1.setText(null);
            l3.setText(null);
        }
        if(r3.isSelected()){
            l3.setForeground(Color.green);
            l3.setText("GO");
            l1.setText(null);
            l2.setText(null);
        }
    }
}
