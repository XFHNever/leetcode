package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiefuheng on 15/2/28.
 *
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1. 
 */
public class LongestSubString {
    //会超时。。。
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() <= 0)
            return 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0, tempLength = 0;
        
        for (int i=0; i<s.length(); i++) {
            map.clear();
            tempLength = 0;
            for (int j=i; j<s.length(); j++) {
                if (map.get(s.charAt(j)) == null) {
                    map.put(s.charAt(j), j);
                    tempLength++;
                } else {
                    i = map.get(s.charAt(j));
                    break;
                }
            }
            if (maxLength < tempLength)
                maxLength = tempLength;
        }
        return maxLength;
    }    
    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() <= 0)
            return 0;

        int maxLength = 1, tempLength = 1, lastIndex = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put(s.charAt(0), 0);
        for (int i=1; i<s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), i);
                tempLength++;
            } else {
                if (lastIndex <= map.get(s.charAt(i))) {
                    tempLength = i - map.get(s.charAt(i));
                    lastIndex = map.get(s.charAt(i)) + 1;
                    map.remove(s.charAt(i));
                    map.put(s.charAt(i), i);
                } else {
                    map.remove(s.charAt(i));
                    map.put(s.charAt(i), i);
                    tempLength++;
                }
            }
            
            if (maxLength < tempLength) {
                maxLength = tempLength;
            }
        }
        
        
        return maxLength;
    }
    
    
}
