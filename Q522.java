import javax.swing.*;
public class Q522 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel l1 = new JLabel();
        l1.setText("Username");
        l1.setBounds(50,50,100,30);
        JLabel l2 = new JLabel();
        l2.setText("Password");
        l2.setBounds(50,150,100,30);
        JTextField t = new JTextField();
        t.setBounds(150,50,200,30);
        JPasswordField p = new JPasswordField();
        p.setBounds(150,150,200,30);
        f.add(l1);
        f.add(t);
        f.add(l2);
        f.add(p);
        f.setLayout(null);
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
