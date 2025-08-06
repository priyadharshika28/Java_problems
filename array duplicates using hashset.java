class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        ArrayList<Integer> res = new ArrayList<>(duplicates);
        return res;
    }
}
