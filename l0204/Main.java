package leetcode.l0204;

class Solution {
    public int countPrimes(int n) {
        int cnt = 0;
        for(int i = 2; i < n; i++) {
            boolean flag = false;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = true;
                    continue;
                }
            }
            if(!flag) {
                cnt++;                
            }
        }
        return cnt;
    }
}