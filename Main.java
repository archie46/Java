import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int num =1;
          for(int i=1;i<=n;i++){
              for(int j=i;j<=n;j++){
                  System.out.print(" ");
              }
              for(int k=1;k<=i;k++){
                  System.out.print(num+" ");
                  num++;
              }
              System.out.println();
          }
//        int[] arr ={1,2,3,4,5,6};
//        int sodd=0,seven=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                seven+=arr[i];
//            }
//            else
//                sodd+=arr[i];
//        }
//        System.out.println("Sum Of Odd Elements :"+sodd);
//        System.out.println("Sum Of Even Elements :"+seven);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int D =(int)Math.sqrt(Math.pow(b,2)-4*a*c);
//        int root1 = (-b+D)/2*a;
//        int root2 = (-b-D)/2*a;
//        System.out.println("Root 1 :"+root1);
//        System.out.println("Root 2 :"+root2);
//        System.out.println("Prime Numbers Between 150 and 500 are :");
//        int i=150;
//        while(i<=500){
//            int j=1;
//            int count=0;
//            while(j<=i){
//               if(i%j==0){
//                   count++;
//               }
//               if(count>2){
//                   break;
//               }
//                j++;
//            }
//            if(count==2){
//                System.out.println(i);
//            }
//            i++;
//        }
//        int n= sc.nextInt();
//        switch(n){
//            case 1:
//                System.out.println("True");
//                break;
//            case 2:
//                System.out.println("False");
//                break;
//            default:
//                System.out.println("Default");
//        }
//        String a = sc.next();
//        String b = sc.next();
//        System.out.println(a.compareTo(b));
       // int n = sc.nextInt();
//        char a =sc.next().charAt(0);
//        System.out.println(Character.toUpperCase(a));
//        a-=32;
//        System.out.println(a);
//        int n=sc.nextInt();
//        int[] arr={1,2,3,4,5};
//        for(int i=0;i<n;i++){
//            if(arr[i]==n){
//                System.out.println("Found");
//                break;
//            }
//        }
//        int sum=0,r;
//        for(int i=n;i>0;i=i/10){
//            r=i%10;
//            sum=sum*10 +r;
//        }
//        System.out.println(sum);
//        if(sum==n){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not A Palindrome");
//        }
//        int n1=0,n2=1,n3;
//        System.out.print(n1+" "+n2+" ");
//        for(int i=2;i<n;i++){
//            n3=n1+n2;
//            System.out.print(n3+" ");
//            n1=n2;
//            n2=n3;
//        }
    }
}
