package leetcode.l0633;

class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i = 0; i <= Math.sqrt(c); i++) {
            if(i * i > c) {
                break;
            } else {
                for(int j = 0; j <= i; j++) {
                    if(i * i + j * j == c) {
                        return true;
                    } else if(i * i + j * j > c) {
                        break;
                    }
                }                
            }
        }
        return false;
    }
}