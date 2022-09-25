import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class Q206 implements ListSelectionListener {
    JList<String> list;
    JOptionPane o = new JOptionPane();
    Q206(){
        JFrame j =  new JFrame();
        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("English");
        l.addElement("Hindi");
        l.addElement("Japanese");
        list = new JList<>(l);
        list.addListSelectionListener(this);
        j.add(list);
        j.setSize(400,300);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }

    public static void main(String[] args) {
        new Q206();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(list.isSelectedIndex(0)){
            JOptionPane.showMessageDialog(o,"You Have Selected English");
        }
        if(list.isSelectedIndex(1)){
            JOptionPane.showMessageDialog(o,"You Have Selected Hindi");
        }
        if(list.isSelectedIndex(2)){
            JOptionPane.showMessageDialog(o,"You Have Selected Japanese");
        }
    }
}
