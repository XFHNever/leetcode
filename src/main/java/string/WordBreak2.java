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
            // i ��ʾ����ַ����ĳ���
            for (int i = 1; i <= len; i++) {
                String sub = s.substring(0, i);

                // ��ߵ��Ӵ�����Ϊ�գ��������ֵ���
                if (!dict.contains(sub)) {
                    continue;
                }

                // �ַ�������Ϊ2�ߣ������ұߵ�word break.
                List<String> listRight = dfs(s.substring(i, len), dict, map);


                // �����ַ����ӵ����ַ����У��γ��µĽ�.
                for (String r: listRight) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(sub);
                    if (i != 0 && i != len) {
                        // ������Ϊ�գ������ұ�Ϊ�գ�����Ҫ���ո�
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
