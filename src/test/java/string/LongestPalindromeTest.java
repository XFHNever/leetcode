package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xiefuheng on 15/3/23.
 */
public class LongestPalindromeTest {
    @Test
    public void test() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String str = "xfhneverrevfskjgfslkdkfgsldkfjgskldgskkkkkkkkkkkkkkk";
        assertEquals("kkkkkkkkkkkkkkk", longestPalindrome.longestPalindrome(str));
    }
}
