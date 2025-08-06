class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length+1;
        long es = (long)n*(n+1)/2;
        long as = 0;
        for(int num:arr){
            as+=num;
        }
        long res = es-as;
        return (int)res;
    }
}
