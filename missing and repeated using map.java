class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int missing = 0;
        int repeated = 0;
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int i=1;i<=arr.length;i++){
            if(!map.containsKey(i)){
                missing = i;
            }
            else if(map.get(i)==2){
                repeated = i;
            }
        }
        list.add(repeated);
        list.add(missing);
        return list;
    }
}
