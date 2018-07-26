package tribonaccisequence;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

/**
 * @author zz76E_blSst
 * @version $Id$
 */
public class XbonacciTest {
    /**
     * Xbonacci;
     */
    private Xbonacci variabonacci;

    /**
     * setUp.
     *
     * @throws Exception - e.
     */
    @Before
    public void setUp() throws Exception {
        variabonacci = new Xbonacci();
    }

    /**
     * tearDown.
     *
     * @throws Exception - e;
     */
    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    /**
     * precision.
     */
    private double precision = 1e-10;

    /**
     * basic test.
     */
    @Test
    public void basicTests() {
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, variabonacci.tribonacci(new double[]{1, 1, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, variabonacci.tribonacci(new double[]{0, 0, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, variabonacci.tribonacci(new double[]{0, 1, 1}, 10), precision);
    }
}
