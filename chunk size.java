import java.util.*;
class Main{
    public static List<int[]> chunkarray(int[] arr, int cs){
        List<int[]> chunk = new ArrayList<>();
        int l = arr.length;
        for(int i=0;i<l;i+=cs){
            int end = Math.min(l,i+cs);
            chunk.add(Arrays.copyOfRange(arr,i,end));
        }
        return chunk;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int cs = sc.nextInt();
        List<int[]> res = chunkarray(arr,cs);
        for(int[] chunk:res){
            System.out.println(Arrays.toString(chunk));
        }
    }
}
