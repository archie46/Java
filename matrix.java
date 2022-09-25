import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows ");
        int r = sc.nextInt();
        System.out.println("Enter The Number Of Columns ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter The Elements");
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix Is ");
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
         System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
