class hi {
    public void run(){
      try{
          for(int i=0;i<4;i++){
              System.out.println("Hi");
              Thread.sleep(1000);
          }
      }
      catch(InterruptedException e){
          System.out.println("Error In Thread Hi");
      }
    }
}
class hell{
    public void run(){
        try{
            for(int i=0;i<4;i++){
                System.out.println("Hello");
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Error In Thread Hello");
        }
    }
}
public class Q115 {
    public static void main(String[] args) {
        hi a = new hi();
        hell b =  new hell();
        a.run();
        b.run();
    }
}
