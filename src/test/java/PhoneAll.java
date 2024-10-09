package test.java;

import java.util.*;

//电话号码的字母组合
public class PhoneAll {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        StringBuffer now_string = new StringBuffer();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        //for循环字符串=
        //dfs输出匹配字母
        if(digits.isEmpty()) return ans;
        dfs(ans, digits, now_string, 0, map);
        return ans;
    }

    private static void dfs(List<String> ans ,String str,StringBuffer now_string,int now, Map<Integer,String> map){
        if(now == str.length()) {
            ans.add(new String(now_string));//边界条件，dfs边界
            return;
        }

        String maybe_now = map.get((int)str.charAt(now)-'0');

        for(int i=0;i<maybe_now.length();i++){
            now_string.append(maybe_now.charAt(i));
            dfs(ans,str,now_string,now+1,map);
            now_string.deleteCharAt(now);
        }
    }
}