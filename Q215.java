class FirstThread implements Runnable{
    public void run(){
       try{
           for(int i=0;i<5;i++){
               System.out.println("Hello From First Thread");
                 Thread.sleep(1000);
           }
       }
       catch(InterruptedException e){
           System.out.println("Oops An Error Occurred !");
       }
    }
}
class SecondThread implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Hello From Second Thread");
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Oops An Error Occurred !");
        }
    }
}
public class Q215 {
    public static void main(String[] args) {
            FirstThread f = new FirstThread();
            SecondThread s = new SecondThread();
             Thread one = new Thread(f);
             Thread two = new Thread(s);
             one.start();
             two.start();

    }
}
