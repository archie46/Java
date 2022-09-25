class MyThread extends Thread{
    public void run(){
      //  try{
         //   for(int i=0;i<3;i++){
                System.out.println("My Thread Is Running");
             //   Thread.sleep(250);
//            }
//        }
//        catch (InterruptedException e){
//            System.out.println("Error");
//        }
    }
}
public class Q415 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
    }
}
