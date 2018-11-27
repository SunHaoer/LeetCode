package leetcode.l0015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	
	public final int MAX = 1024;
	List<List<Integer>> result = new ArrayList<List<Integer>>(); 
	List<String> exist = new ArrayList<String>();
	
	public void addToResult(Integer a, Integer b, Integer c) {		// 向result添加temp
		List<Integer> temp = new ArrayList<>(3);
		temp.add(a);
		temp.add(b);
		temp.add(c);
		if(!result.contains(temp)) {		// 不重复
			result.add(temp);
		}
	}
	
	public void getTempList(List<Integer> list1, List<Integer> list2, int ch) {
		int maxn = list2.get(list2.size() - 1);
		System.out.println(maxn);
		for(int i = 0; i < list1.size(); i++) {		// 同号2数相加
			if(list1.get(i) > maxn) {
				break;
			}
			for(int j = i + 1; j < list1.size(); j++) {
				if(list1.get(i) + list1.get(j) > maxn) {
					break;
				}
				if(list2.contains(list1.get(i) + list1.get(j))) {
					addToResult(ch * list1.get(i), ch * list1.get(j), -ch * (list1.get(i) + list1.get(j)));
				}
			}
		}
	}
	
    public List<List<Integer>> threeSum(int[] nums) {
    	if(nums.length < 3) {		// 无解
    		return result;
    	} else {		
    		List<Integer> list1 = new ArrayList<Integer>(), list2 = new ArrayList<Integer>();		// list1 < 0, list2 >= 0
    		for(int i = 0; i < nums.length; i++) {
    			if(nums[i] < 0) {
    				list1.add(-nums[i]);
    			} else {
    				list2.add(nums[i]);
    			}
    		}
    		Collections.sort(list1);
    		Collections.sort(list2);
    		if(list2.size() > 2 && list2.get(2) == 0) {
    			addToResult(0, 0, 0);
    		}
    		if(list1.isEmpty() || list2.isEmpty()) {
    			return result;
    		}
    		getTempList(list1, list2, -1);
    		getTempList(list2, list1, 1);
    		return result;
    	}
    	
    }
}

public class Main {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = new int[] {0, 0, 0};
		System.out.println(solution.threeSum(nums));
	}
	
}


/*
 * 运行超时
 */
