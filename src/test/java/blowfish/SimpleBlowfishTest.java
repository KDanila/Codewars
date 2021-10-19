//package blowfish;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Arrays;
//
//import static org.junit.Assert.*;
//
//public class SimpleBlowfishTest {
//    @Test
//    public void basicTests() {
//        SimpleBlowfish blowfish = new SimpleBlowfish();
////        Assert.assertEquals("", blowfish.encrypt("",""));
////        Assert.assertEquals("", blowfish.encrypt("","tandy"));
////        Assert.assertEquals("tandy", blowfish.encrypt("tandy",""));
////        Assert.assertEquals(blowfish.encrypt("a", "a"), blowfish.encrypt("a","abc"));
////        Assert.assertEquals(blowfish.encrypt("ab", "ab"), blowfish.encrypt("ab","abcbb"));
//        char[] expected = {24929, 24930, 24931};
//        Assert.assertTrue(Arrays.equals(expected, blowfish.encrypt("abc", "a").toCharArray()));
//        expected = new char[]{18259, 21104, 17785, 16672, 21611, 18281, 21108};
//        Assert.assertTrue(Arrays.equals(expected, blowfish.encrypt("Spy kit", "GREAT").toCharArray()));
//    }
//}