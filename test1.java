import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
            int  f = 0;
            int  l = n-1;
            boolean b = true;
            while(l>f){

                int mid = (f+l)/2;
                System.out.println(mid+" "+f+" "+l);
                if(arr[mid]==t){
                    System.out.println("Found");
                    b = false;
                    break;
                }
                if(arr[mid]>t)
                    l = mid-1;
                if(arr[mid]<t)
                    f = mid+1;
            }
            if(b)
                System.out.println("Not Found");

    }
}
