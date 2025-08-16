import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 matrix[i][j] = sc.nextInt();
            }
        }
        int count =0;
        int sum;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                if(matrix[i][j]%2!=0){
                    sum+=matrix[i][j];
                }
            }
            if(sum!=0 && sum%2==0){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
