class rust implements Runnable{

    @Override
    public void run() {

            try {
                for(int i = 0;i<4;i++) {
                    System.out.println("Hello");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Oops An Error Occurred !");
            }
        }
        public void start(){
           this.run();
        }
    }
public class test3 {
    public static void main(String[] args) {
        rust th = new rust();
        th.start();
    }
}
