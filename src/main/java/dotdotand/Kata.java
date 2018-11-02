package dotdotand;

import java.util.*;

/**
 * @author zz76E_blSst
 * @version $Id$
 */
public class Kata {
    /**
     * formatWords method.
     *
     * @param words - income string array.
     * @return string.
     */
    public static String formatWords(String[] words) {
        if (words == null) return "";
        words = checkingNull(words);
        int comaCount = words.length - 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (comaCount == -1) return words[0];
            sb.append(words[i]);
            if ((comaCount == 0)) {
                sb.append(" and ");
                sb.append(words[i + 1]);
                break;
            } else {
                sb.append(", ");
            }
            comaCount--;
        }
        return sb.toString();
    }

    /**
     * checkingNull method.
     *
     * @param words - income array.
     * @return string[] - outcome filtered array.
     */
    private static String[] checkingNull(String[] words) {
        List<String> w = new ArrayList<>(Arrays.asList(words));
        w.removeIf(x -> x == null || x.isEmpty());
        return w.toArray(new String[w.size()]);
    }
}
/*
        if (words == null || words.length == 0)
            return "";
        List<String> clearWords = new ArrayList<>(Arrays.asList(words));
        clearWords.removeIf(String::isEmpty);
        if (clearWords.isEmpty())
            return "";
        if (clearWords.size() == 1)
            return clearWords.get(0);
        String start = String.join(", ", clearWords.subList(0, clearWords.size() - 1));
        return start + " and " + clearWords.get(clearWords.size() - 1);

         public static String formatWords(String[] words) {
    if (words==null) return "";
    words = Stream.of(words).filter(s->!s.isEmpty()).toArray(String[]::new);
    int n = words.length;
    if (n==0) return "";
    if (n==1) return words[0];
    String s = words[0];
    for (int i=1; i<n-1; i++) s+=", "+words[i];
    return s+" and "+words[n-1];
  }
 */