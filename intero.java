class  Ar{
    protected interface B{
        void hello();
    }
}
class fri implements Ar.B{
    public void hello(){
        System.out.println("Hello Friends");
    }
}

public class intero {
    public static void main(String[] args) {
        fri f = new fri();
        f.hello();
    }
}
