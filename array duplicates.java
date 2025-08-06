class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList res = new ArrayList<>();
        for(int i=0;i<n;i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index]<0){
                res.add(Math.abs(arr[i]));
            }
            else{
                arr[index]=-arr[index];
            }
        }
        return res;
    }
}
