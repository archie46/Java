import java.util.Scanner;

public class Q808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter First Number:");
            int a = sc.nextInt();
            System.out.print("Enter Second Number:");
            int b = sc.nextInt();
            System.out.println("Result :"+a/b);
        }
        catch(ArithmeticException e){
            System.out.println("You Can't Divide By Zero");
        }
        finally{
            System.out.println("Everything Ends");
        }
    }
}
