import javax.swing.*;
public class Q422 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        ImageIcon image = new ImageIcon("Lily.jpg");
        JLabel j = new JLabel(image);
        j.setSize(399,399);
        f.setTitle("Flower");
        ImageIcon img = new ImageIcon("flower.jpg");
        f.setIconImage(img.getImage());
        f.add(j);
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
