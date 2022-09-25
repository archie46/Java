import java.util.Scanner;

public class Q708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter First Number:");
            int a = sc.nextInt();
            System.out.print("Enter Second Number:");
            int b = sc.nextInt();
            System.out.println("Result :"+a/b);
        }
        catch(Exception e){
            System.out.println("The Program Encountered An Error");
        }
    }
}
