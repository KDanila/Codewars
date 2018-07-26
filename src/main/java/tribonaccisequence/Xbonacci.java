package tribonaccisequence;

import java.util.Arrays;

/**
 * @author zz76E_blSst
 * @version $Id$
 */
public class Xbonacci {
    /**
     * tribonacci method.
     *
     * @param s - initial array(0,0,1 or 0,1,1 or 1,1,1)
     * @param n - length of tribonacci array.
     * @return array where each position is sum of previous 3.
     */
    public double[] tribonacci(double[] s, int n) {
        double[] toReturn = Arrays.copyOf(s, n);
        for (int i = 3; i < toReturn.length; i++) {
            toReturn[i] = toReturn[i - 1] + toReturn[i - 2] + toReturn[i - 3];
        }
        return toReturn;
    }
}