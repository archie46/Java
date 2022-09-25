class count{
    int x;
    static int y;
    void print(){
        x++;
        y++;
        System.out.println(x+" "+y);
    }
}
public class check {
    public static void main(String[] args) {
      count c = new count();
      count d = new count();
      c.print();
      d.print();
    }
}
