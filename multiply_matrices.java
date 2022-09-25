public class multiply_matrices {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4}
        };
        int[][] arr2 = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4}
        };
        int[][] pro  = new int[4][4];
        for(int i = 0;i<4;i++){
            for(int j = 0 ;j<4;j++){
                for(int k = 0;k<4;k++){
                    pro[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for (int i =0;i<4;i++){
            for(int j =0 ;j<4;j++){
                System.out.print(pro[i][j]+" ");
            }
            System.out.println();
        }
    }
}
