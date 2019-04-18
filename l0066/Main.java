package leetcode.l0066;

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> tempList = new ArrayList<Integer>();
        int b = 1;
        for(int i = digits.length - 1; i >= 0; i--) {
            int a = digits[i];
            int c = (a + b) % 10;
            b = (a + b) / 10;
            tempList.add(c);
        }
        if(b != 0) {
            tempList.add(b);
        }
        int[] result = new int[tempList.size()];
        int j = 0;
        for(int i = tempList.size() - 1; i >= 0; i--) {
            result[j++] = tempList.get(i);
        }
        System.out.println(tempList);
        return result;
    }
}