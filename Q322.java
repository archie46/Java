
import java.awt.*;

public class Q322 extends Frame {
    public void paint(Graphics g){
        g.drawString("Hello World!",150,100);
    }
    public static void main(String[] args) {
        Q322 f = new Q322();
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setBackground(Color.cyan);
        f.setVisible(true);
    }
}
