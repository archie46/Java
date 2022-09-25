interface a{
    interface b{
              void hello();
    }
}
class him implements a.b{
    public void hello(){
        System.out.println("Hello World!");
    }
}
public class working {
    public static void main(String[] args) {
        him h = new him();
        h.hello();
    }
}
