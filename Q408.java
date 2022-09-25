
import java.util.*;
public class Q408 {
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
        catch(InputMismatchException f){
            System.out.println("Enter A Number Only");
        }
    }
}
