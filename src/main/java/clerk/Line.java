package clerk;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.valueOf;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        List<Integer> money = new ArrayList<>();
        for (int i = 0; i < peopleInLine.length; i++) {
            int m = peopleInLine[i];
            money.add(m);
            if (m == 50) {
                if (money.contains(25)) {
                    money.remove(valueOf(25));
                } else {
                    return "NO";
                }
            } else if (m == 100) {
                if (money.contains(25) && money.contains(50)) {
                    money.remove(valueOf(25));
                    money.remove(valueOf(50));
                } else if (money.stream().filter(x -> x == 25).count() == 3) {
                    money.remove(valueOf(25));
                    money.remove(valueOf(25));
                    money.remove(valueOf(25));
                } else {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
