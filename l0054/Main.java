package leetcode.l0054;

import java.util.List;

class Solution {
	
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new java.util.LinkedList<Integer>();
        if(matrix.length != 0) {
        	int n = matrix.length, m = matrix[0].length;
        	int cnt = n * m, ans = 0;		// 元素个数, 循环次数
        	if(n == 1) {
        		for(int i = 0; i < m; i++) {
        			result.add(matrix[0][i]);
        		}
        	} else if(m == 1) {
        		for(int i = 0; i < n; i++) {
        			result.add(matrix[i][0]);
        		}
        	} else {
	        	while(result.size() < cnt - 1) {
	        		System.out.println(result.size() + " " + cnt);
	        		for(int i = ans; i < m - 1 - ans; i++) {
	        			result.add(matrix[ans][i]);
                        if(result.size() == cnt) {
                        	break;
                        }
	        		}
	        		for(int i = ans; i < n - 1 - ans; i++) {
	        			result.add(matrix[i][m - 1 - ans]);
                        if(result.size() == cnt) {
                        	break;
                        }
	        		}
	        		for(int i = m - 1 - ans; i > ans; i--) {
	        			result.add(matrix[n - 1 - ans][i]);
                        if(result.size() == cnt) {
                        	break;
                        }
	        		}
	        		for(int i = n - 1 - ans; i > ans; i--) {
	        			result.add(matrix[i][ans]);
                        if(result.size() == cnt) {
                        	break;
                        }
	        		}
	        		ans++;
	        	}
	            if(cnt % 2 != 0 && result.size() != cnt) {
	                result.add(matrix[n / 2][m / 2]);
	            }
	        }        		
        }
    	return result;
    }
    
}

