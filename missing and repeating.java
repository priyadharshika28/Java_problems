import java.util.ArrayList;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[], int n) {
        long sum = 0;
        long sumsq = 0;
        long expecsum = (long)n * (n + 1) / 2;
        long expecsumsq = (long)n * (n + 1) * (2 * n + 1) / 6;

        for (int num : arr) {
            sum += num;
            sumsq += (long)num * num;
        }

        long diff = sum - expecsum;
        long diffsq = sumsq - expecsumsq;

        long sumrm = diffsq / diff;

        int repeating = (int)(diff + sumrm) / 2;
        int missing = (int)(repeating - diff);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
}
