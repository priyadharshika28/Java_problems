class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        int l = arr.length;
        ArrayList finalList = new ArrayList();
        int start = 0;
        int end = l-1;
        
        while(start < end){
            int sum = arr[start] + arr[end];
            
            if(sum > 0){
                end--;
            }else if(sum < 0){
                start++;
            }else{
                ArrayList<Integer> list = new ArrayList();
                list.add(arr[start]);
                list.add(arr[end]);
                finalList.add(list);
                while( start < end && arr[start] == arr[start +1]){
                    start++;
                }
                 while(start < end &&arr[end] == arr[end - 1]){
                    end--;
                }
                start++;
                end--;
            }
        }
        
        return finalList;
    }
}
