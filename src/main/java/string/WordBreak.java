package string;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by never on 2014/11/4.
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
        if (dict == null)
            return true;
        if (dict.isEmpty())
            return false;
        if (s == null)
            return false;

        Iterator iterator = dict.iterator();
        while (iterator.hasNext()) {
            String temp = (String) iterator.next();

            if (s.contains(temp)) {
                s.replace(temp, " ");
            } else {
                return false;
            }
        }

        return true;
    }
    public boolean wordBreak2(String s, Set<String> dict) {
        return wordBreakHelper(s, dict, 0);
    }

    private boolean wordBreakHelper(String s, Set<String> dict, int start) {
        if (dict == null)
            return true;
        if (dict.isEmpty())
            return false;

        if (s == null)
            return false;

        if (start >= s.length())
            return true;

        for (String temp : dict) {
            int end = start + temp.length();

            if (end > s.length())
                continue;

            if (s.substring(start, end).equals(temp)) {
                return wordBreakHelper(s, dict, end);
            }
        }


        return false;
    }

    public boolean wordBreak3(String s, Set<String> dict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        for (int i=0; i< s.length(); i++) {
            if (!dp[i])
                continue;

            for (String temp : dict) {
                int end = temp.length() + i;
                if (end > s.length())
                    continue;
                if (dp[end])
                    continue;

                if (s.substring(i, end).equals(temp)) {
                    dp[end] = true;
                }
            }
        }

        return dp[s.length()];
    }
}
