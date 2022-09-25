class AThread extends Thread{
    public void run(){
                System.out.println("Hello From First Thread");
        }
}
class BThread extends Thread{
    public void run(){
                System.out.println("Hello From Second Thread");
    }
}public class Q515 {
    public static void main(String[] args) {
        AThread a = new AThread();
        BThread b = new BThread();
        a.start();
        System.out.println("Is First Thread Alive ? :"+a.isAlive());
        b.start();
        System.out.println("Is Second Thread Alive ? :"+b.isAlive());
    }
}
