import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * @lc app=leetcode.cn id=811 lang=java
 *
 * [811] 子域名访问计数
 */

// @lc code=start
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> hashMap = new HashMap<>();
        for(String cpdomainStr : cpdomains) {
            int visitNum = new Integer(cpdomainStr.split(" ")[0]).intValue();
            String cpdomainArr[] = cpdomainStr.split(" ")[1].split("\\.+");
            String tempCpdomain = "";
            for(int i = cpdomainArr.length - 1; i >= 0; i--) {
                tempCpdomain = cpdomainArr[i] + (tempCpdomain.length() == 0 ? "" : ".") + tempCpdomain;
                Integer num = hashMap.get(tempCpdomain);
                if(num == null) {
                    num = 0;
                } 
                hashMap.put(tempCpdomain, num + visitNum);
            }
        }
        List<String> resultList = new ArrayList();
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            resultList.add(entry.getValue() + " " + entry.getKey());
        }
        return resultList;
    }
}
// @lc code=end

