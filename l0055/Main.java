package leetcode.l0055;

class Solution {
	
	public final int MAX = 1000000;
	public boolean flag = false;
	public boolean[] visited = new boolean[MAX];
	
	public void eachStep(int[] nums, int index) {
		if(!flag) {
			visited[index] = true;
			if(index == nums.length - 1) {
				flag = true;
			} else {
                if(index + nums[index] >= nums.length - 1) {
                    flag = true;
                } else {
                    for(int i = 1; i <= nums[index] && index + i < nums.length; i++) {
                        if(!visited[index + i]) {
                            eachStep(nums, index + i);
                        }		
                    }			                    
                }
			 }
		}
	}
	
    public boolean canJump(int[] nums) {
        eachStep(nums, 0);
    	return flag;
    }
    
}

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int nums[] = new int[] {3,0,8,2,0,0,1};
		System.out.println(solution.canJump(nums));
	}
}


/*
 * 部分测试点未通过
 */
