import javax.swing.*;
public class Q622 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JCheckBox cb1 = new JCheckBox();
        JCheckBox cb2 = new JCheckBox();
        JCheckBox cb3 = new JCheckBox();
        cb1.setText("Bold");
        cb2.setText("Italic");
        cb3.setText("Underline");
        cb1.setBounds(100,100,150,50);
        cb2.setBounds(100,150,150,50);
        cb3.setBounds(100,200,150,50);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.setSize(300,300);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
