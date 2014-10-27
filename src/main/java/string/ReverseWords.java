package string;

import java.util.ArrayList;

/**
 * Created by fuxie on 2014/10/27  10:58.
 *
 * Given an input string, reverse the string word by word.
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 */
public class ReverseWords {
    public String reverseWords(String words) {
        if( words.equals(""))
            return words;

        while(words.startsWith(" ")){
            words = words.substring(1, words.length());
        }
        while(words.endsWith(" ")){
            words = words.substring(0, words.length()-1);
        }

        String[] list = words.split("\\s{1,}");
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<list.length -1; i++) {
            builder.append(reverse(list[i]));
            builder.append(" ");
        }
        builder.append(reverse(list[list.length-1]));

        return reverse(builder.toString());
    }

    private String reverse(String str) {
        StringBuilder builder = new StringBuilder();
        int j = str.length()-1;

        for (; j>=0; j--) {
            builder.append(str.charAt(j));
        }
        return builder.toString();
    }

    public String reverseWords2(String s) {
        if( s.equals(""))
            return s;

        //为了使用用split函数，去掉开头和结尾的空格
        while(s.startsWith(" ")){
            s = s.substring(1, s.length());
        }
        while(s.endsWith(" ")){
            s = s.substring(0, s.length()-1);
        }

        if (!s.contains(" "))
            return s;

        //正则表达式，消掉多个空格
        String[] st = s.split("\\s{1,}");
        ArrayList<String> list = new ArrayList<String>();
        int i = st.length - 1;
        for(; i>=0 ; i--){
            list.add(st[i]);
        }

        String result = list.toString();
        result = result.substring(1, result.length()-1);
        result=result.replaceAll(", "," ");
        return result;
    }

    public String reverseWords3(String s) {
        StringBuilder reversed = new StringBuilder();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                j = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (reversed.length() != 0) {
                    reversed.append(' ');
                }
                reversed.append(s.substring(i, j));
            }
        }
        return reversed.toString();
    }
}
