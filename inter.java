interface human{
    void eat();
}
class Yash implements human{
    public void eat(){
        System.out.println("Yash Is Eating Dosa");
    }

}
class Ayush implements human{
    public void eat(){
        System.out.println("Ayush Is Eating Masala Dosa");
    }

}
public class inter {
    public static void main(String[] args) {
        human yash = new Yash();
        human ayush = new Ayush();
        yash.eat();
        ayush.eat();
    }
}
