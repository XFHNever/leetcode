package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fuxie on 2014/10/27  11:09.
 */
public class ReverseWordsTest {
    @Test
    public void testReverse() {
        String str = "the sky is blue";
        ReverseWords reverseWords = new ReverseWords();
        assertEquals("blue is sky the", reverseWords.reverseWords(str));
    }
    @Test
    public void testReverse2() {
        String str = "the sky is blue";
        ReverseWords reverseWords = new ReverseWords();
        assertEquals("blue is sky the", reverseWords.reverseWords2(str));
    }
    @Test
    public void testReverse3() {
        String str = "the sky is blue";
        ReverseWords reverseWords = new ReverseWords();
        assertEquals("blue is sky the", reverseWords.reverseWords3(str));
    }
}
