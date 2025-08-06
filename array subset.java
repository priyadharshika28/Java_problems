
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int n = a.length;
        int m = b.length;
        while(i<n && j<m){
            if(a[i]==b[j]){
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                return false;
            }
        }
        return j==m;
    }
}
