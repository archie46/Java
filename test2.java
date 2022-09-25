public class test2 {
//    1
//    1 0 1
//    1 0 0 0 1
//    1 0 0 0 0 0 1
//    1 0 0 0 0 0 0 0 1
public static void main(String[] args) {
    System.out.println(1);
    int n = 0;
    for(int i = 1;i<5;i++){
        System.out.print(1+" ");
                for(int k =0;k<i+n;k++){
                    System.out.print(0+" ");
            }
                n=n+1;
        System.out.print(1+"\n");
    }
}

}
