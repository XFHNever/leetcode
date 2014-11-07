package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by never on 2014/11/5.
 *
 * more https://github.com/yuzhangcmu/LeetCode_algorithm/blob/master/dp/WordBreak2.java
 */
public class WordBreak2 {
    public List<String> wordBreak(String s, Set<String> dict) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        if (s == null || s.length() == 0 || dict == null) {
            return null;
        }

        return dfs(s, dict, map);
    }

    private List<String> dfs(String s, Set<String> dict, HashMap<String, List<String>> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }

        List<String> list = new ArrayList<String>();
        int len = s.length();

        if (len == 0) {
            list.add("");
        } else {
            // i 表示左边字符串的长度
            for (int i = 1; i <= len; i++) {
                String sub = s.substring(0, i);

                // 左边的子串可以为空，或是在字典内
                if (!dict.contains(sub)) {
                    continue;
                }

                // 字符串划分为2边，计算右边的word break.
                List<String> listRight = dfs(s.substring(i, len), dict, map);


                // 把左字符串加到右字符串中，形成新的解.
                for (String r: listRight) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(sub);
                    if (i != 0 && i != len) {
                        // 如果左边为空，或是右边为空，不需要贴空格
                        sb.append(" ");
                    }
                    sb.append(r);
                    list.add(sb.toString());
                }
            }
        }

        map.put(s, list);
        return list;
    }
}
