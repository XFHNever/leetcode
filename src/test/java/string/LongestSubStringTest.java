package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xiefuheng on 15/2/28.
 */
public class LongestSubStringTest {
    @Test
    public void test() {
        String str1 = "abcabcbb";
        String str2 = "bbbbb";

        LongestSubString longestSubString = new LongestSubString();
     //   assertEquals(3, longestSubString.lengthOfLongestSubstring2(str1));
     //   assertEquals(1, longestSubString.lengthOfLongestSubstring2(str2));
        assertEquals(3, longestSubString.lengthOfLongestSubstring2("bwf"));
    }
}
