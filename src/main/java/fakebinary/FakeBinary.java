package fakebinary;

import java.util.Random;

/*
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        char[] chars = numberString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (ch == '0') {
                sb.append(new Random().nextInt(6));
            } else if (ch == '1') {
                sb.append(new Random().nextInt(5) + 5);
            } else {
                throw new NumberFormatException("String should contain only digit");
            }
        }
        return sb.toString();
    }
}
