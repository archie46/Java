class first{
    int a=5;
}
class second extends first{
    int a =10;
}
public class Q525 {
    public static void main(String[] args) {
        first f =  new second();
        System.out.println("Value Of a is "+f.a);
    }
}
