// 0 ms | 42.6 MB
class Solution {
    public int countCommas(int n) {
        return n < 1000 ? 0 : n - 999;
        // int count = 0;
        // int cur = n;
        // while (cur > 0) {
        //     count++;
        //     cur = cur / 10;
        // }
        // int sum = 0;
        // if(count < 4) sum = 0;
        // else if (count < 7) {
        //     sum = (n-999);
        // }
        // else if (count < 10 ) {
        //     sum = (n - 999999)*2 +  (999999-999);
        // }
        // else {
        //     sum = (n - 999999999)*3+(999999999 - 999999)*2 +  (999999-999);
        // }
        // return sum;
    }
}