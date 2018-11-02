package nextbiggernumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zz76E_blSst
 * @version $Id$
 */
public class Kata {
    /**
     * numArrays.
     */
    private static List<String> numArrays;

    /**
     * nextBiggerNumber.
     *
     * @param n - long.
     * @return - long.
     */
    public static long nextBiggerNumber(long n) {
        numArrays = new ArrayList<>(Arrays.asList(String.valueOf(n).split("")));
        int minIndex = numArrays.size() - 1;
        for (int i = numArrays.size() - 1; i > 0; i--) {
            int xi = Integer.parseInt(numArrays.get(i));
            if (xi <= Integer.parseInt(numArrays.get(minIndex))) {
                minIndex = i;
            }
            for (int j = i - 1; j >= 0; j--) {
                int xj = Integer.parseInt(numArrays.get(j));
                if (xi == xj) {
                    minIndex = --i;
                    continue;
                }
                if (xi > xj) {
                    changeNumber(i, j);
                    changeNumber(i, minIndex);
                    return makeString(numArrays);
                }
            }
        }
        return -1;
    }

    /**
     * changeNumber.
     *
     * @param firstIndex - fi.
     * @param secondIndex - si.
     */
    private static void changeNumber(int firstIndex, int secondIndex) {
        String temp = numArrays.get(firstIndex);
        numArrays.set(firstIndex, numArrays.get(secondIndex));
        numArrays.set(secondIndex, temp);
    }

    /**
     * makeString.
     *
     * @param numArrays na.
     * @return long.
     */
    private static long makeString(List<String> numArrays) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : numArrays) {
            stringBuilder.append(s);
        }
        return Long.valueOf(stringBuilder.toString());
    }
}