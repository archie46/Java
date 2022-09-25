class A{
    private class C{
       void print(){
           System.out.println("Helllo World!");
       }
    }
    void display(){
         C c = new C();
         c.print();
    }
}
public class ch {
    public static void main(String[] args) {
         A a = new A();
         a.display();
    }
}
