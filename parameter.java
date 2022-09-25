import java.util.Scanner;

    class Addition{
     static int add(int x, int y){

         return  x+y;

    }

    static double add (double A , double B){
    return A+B;
    }
    }
public class parameter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.println(Addition.add(x, y));
        System.out.println(Addition.add(A, B));
    }
}
