public class meth {
   static void add(int a,int b){
        System.out.println("Method 1 :"+(a+b));
    }
    static void add(float a,float b){
        System.out.println("Method 2 :"+(a+b));
    }
    public static void main(String[] args) {
        add(4,5);
        add(4.2f,5.6f);
    }
}
