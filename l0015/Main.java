package leetcode.l0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	
	public final int MAX = 1024;
	List<List<Integer>> result = new ArrayList<List<Integer>>(); 
	
	public void addToResult(Integer a, Integer b, Integer c) {		// 向result添加temp
		List<Integer> temp = new ArrayList<>(3);
		temp.add(a);
		temp.add(b);
		temp.add(c);
		if(!result.contains(temp)) {		// 不重复
			result.add(temp);
		}
	}
	
	public boolean binarySearch(int a, int b, List<Integer> list) {		// 二分查找
		int left = 0, right = list.size() - 1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(a + b == list.get(mid)) {
				return true;
			} else if(a + b < list.get(mid)) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}
	
	public void getTempList(List<Integer> list1, List<Integer> list2, int ch, Map<Integer, Boolean> map) {
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
//				Integer[] tempArr = new Integer[list2.size()];
//				list2.toArray(tempArr);
//				if(Arrays.binarySearch(tempArr, list1.get(i) + list1.get(j)) >= 0) {
//				if(binarySearch(list1.get(i), list1.get(j), list2)) {
				if(map.get(list1.get(i) + list1.get(j)) != null) {
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
    		Map<Integer, Boolean> map1 = new HashMap<Integer, Boolean>(), map2 = new HashMap<Integer, Boolean>();
    		for(int i = 0; i < nums.length; i++) {
    			if(nums[i] < 0) {
    				list1.add(-nums[i]);
    				map1.put(-nums[i], true);
    			} else {
    				list2.add(nums[i]);
    				map2.put(nums[i], true);
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
    		getTempList(list1, list2, -1, map2);
    		getTempList(list2, list1, 1, map1);
    		return result;
    	}
    	
    }
}

public class Main {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		
		System.out.println(solution.threeSum(nums));
	}
	
}


/*
 * 运行超时
 */
