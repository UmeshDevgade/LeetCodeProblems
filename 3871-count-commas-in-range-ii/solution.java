// 1 ms | 42.7 MB
class Solution {
    public long countCommas(long n) {
        int count = 0;
        long cur = n;
        while (cur > 0) {
            count++;
            cur = cur / 10;
        }
        long sum = 0;
        if(count < 4) sum = 0;
        else if (count < 7) {
            sum = (n-999);
        }
        else if (count < 10 ) {
            sum = (n - 999999L)*2 +  (long)(999999L-999L);
        }
        else if (count < 13){
            sum = (n - 999999999L)*3+(999999999L - 999999L)*2 + (long) (999999L-999L);
        }
        else if(count < 16) {
            sum = (n - 999999999999L)*4+ (999999999999L - 999999999L)*3+(999999999L - 999999L)*2 +  (long)(999999L-999L);
        }
        else {
                        sum = (n - 999999999999999L)*5+( 999999999999999L- 999999999999L)*4+ (999999999999L - 999999999L)*3+(999999999L - 999999L)*2 +  (long)(999999L-999L);
        }
        return sum;
    }
}