class First{
    void calculate(int a){
        System.out.println("Square Of "+a+" is "+a*a);
    }
}
class Second extends First{
    void calculate(int a){
        System.out.println("Cube Of "+a+" is "+a*a*a);
    }
}

class Third extends First{
    void calculate(int a){
        System.out.println("Fourth Power Of "+a+" is "+a*a*a*a);
    }
}
public class Q125 {
    public static void main(String[] args) {
            First f = new First();
            Second s = new Second();
            Third t = new Third();
            First ref;
            ref = f;
            ref.calculate(4);
            ref = s;
            ref.calculate(4);
            ref = t;
            ref.calculate(4);
    }
}
