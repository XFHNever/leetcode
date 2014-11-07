package string;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/5.
 */
public class WordBreak2Test {
    @Test
    public void test() {
        String s = "catsanddog";
        Set<String> dict = new HashSet<String>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");

        WordBreak2 wordBreak2 = new WordBreak2();

        assertEquals(2, wordBreak2.wordBreak(s, dict).size());
    }
}
