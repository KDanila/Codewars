package phonenumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * ValidPhoneNumber class test.
 *
 * @author Kuzmin Danila (mailto:bus1d0@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class ValidPhoneNumberTest {
    /**
     * Test.
     */
    @Test
    public void tests() {
        assertEquals(true, ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
    }
}