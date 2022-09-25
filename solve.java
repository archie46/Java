public class solve {
    public static void print1(int n){
        for(int i = 0;i<n;i++){
            for(int k = n;k>i;k--){
                System.out.print(" ");
            }
            for (int j =0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print2(int n){
        for(int i = 0;i<n;i++){
            for(int k = 0;k<i;k++){
                System.out.print(" ");
            }
            for (int j =n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static  void print3(int n){
        for(int i =1;i<n;i++){
            for(int j =1;j<=i;j++){
                if(i%2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else
                        System.out.print("0 ");
                }
                else{
                    if (j % 2 == 0) {
                        System.out.print("0 ");
                    } else
                        System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      //    print1(6);
     //     print2(6);
          print3(6);
    }
}
