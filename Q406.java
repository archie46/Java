import javax.swing.*;
import java.awt.event.*;
public class Q406 implements ActionListener{
    JComboBox<String> c;
    JOptionPane o = new JOptionPane();
    Q406(){
        JFrame j =  new JFrame();
        String[] languages ={"English","Hindi","Japanese"};
        c = new JComboBox<>(languages);
        c.setBounds(50,100,100,30);
        c.addActionListener(this);
        j.add(c);
        j.setLayout(null);
        j.setSize(400,300);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(c.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(o,"You Have Selected English");
        }
        if(c.getSelectedIndex()==1){
            JOptionPane.showMessageDialog(o,"You Have Selected Hindi");
        }
        if(c.getSelectedIndex()==2){
            JOptionPane.showMessageDialog(o,"You Have Selected Japanese");
        }
    }

    public static void main(String[] args) {
        new Q406();
    }
}
