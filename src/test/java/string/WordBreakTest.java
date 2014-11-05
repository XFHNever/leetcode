package string;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Created by never on 2014/11/4.
 */
public class WordBreakTest {
    @Test
    public void test() {
        String s = "abcd";
        Set<String> dict = new HashSet<String>();
        dict.add("a");
        dict.add("b");
        dict.add("abc");
        dict.add("cd");

        WordBreak wordBreak = new WordBreak();

        assertTrue(wordBreak.wordBreak3(s, dict));
    }
}
