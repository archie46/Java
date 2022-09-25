abstract class myclass1{
    abstract void hello();
}
class Friend1 extends myclass1{
    public void hello() {
        System.out.println("Hello Friend1");
    }
}
class Friend2 extends myclass1{
    public void hello() {
        System.out.println("Hello Friend2");
    }
}
public class Q425 {
    public static void main(String[] args) {
        Friend1 f1 =new Friend1();
        Friend2 f2 =new Friend2();
        f1.hello();
        f2.hello();
    }
}
