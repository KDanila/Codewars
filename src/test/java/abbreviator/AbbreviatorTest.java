package abbreviator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author zz76E_blSst
 * @version $Id$
 */
public class AbbreviatorTest {
    /**
     * Abriviator.
     */
    private Abbreviator abbr = new Abbreviator();

    /**
     * Simple test.
     */
    @Test
    public void testInternationalization() {
        assertEquals("i18n", abbr.abbreviate("internationalization"));
    }
    /**
     * Simple test two.
     */


    @Test
    public void testTwoWords() {
        assertEquals("e6t-r2e", abbr.abbreviate("elephant-ride"));
    }

}