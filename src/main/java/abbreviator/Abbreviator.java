package abbreviator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zz76E_blSst
 * @version $Id$
 */
public class Abbreviator {

    /**
     * Abbrivate method.
     *
     * @param string - string to make to abbreviate.
     * @return string - abbreviate.
     */
    public String abbreviate(String string) {

        String res = string;
        Pattern p = Pattern.compile("([a-zA-Z]{4,})");
        Matcher m = p.matcher(string);

        while (m.find()) {
            String part = m.group();
            String repl = "" + part.charAt(0) + (part.length() - 2) + part.charAt(part.length() - 1);
            res = res.replaceFirst(part, repl);
        }
        return res;
    }
}