//package blowfish;
//
//import static java.util.Objects.isNull;
//
///**
// * Blowfish is an old & complex encryption algorithm.
// * <p>
// * we took few elements from it to create our own simple version of this algorithm.
// * <p>
// * our encryption method should get 2 Strings - plainText and password. which can be any string.
// * <p>
// * the encryption algorithm: we are doing speical XOR between every char of the plainText with the parallel char of the
// * password - if the password is shorter than the plainText then it runs in a loop and start over from it's first char.
// * (example: plain text:"ab", password:"a" -> we should do 'a' special XOR 'a', 'b' special XOR 'a')
// * <p>
// * Special XOR = doing XOR between 2 chars only that the second char's first 8 bits(from the left) are swapped with it's
// * last 8 bits(the right ones).
// * <p>
// * for example: special XOR of 2 chars(bits representing) -> 1100110010101010 with 0001110011100111
// * is actually 1100110010101010 XOR 1110011100011100.
// * <p>
// * the second char was 0001110011100111 - so we swapped it's bits to 1110011100011100
// * <p>
// * Good luck.
// */
//public class SimpleBlowfish {
//    public String encrypt(String plainText, String password) {˜
//        if ("".equals(plainText)) {
//            return "";
//        }
//        if ("".equals(password)) {
//            return plainText;
//        }
//        char[] textArray = plainText.toCharArray();
//        char[] passwordArray = password.toCharArray();
//        char[] toReturn = new char[textArray.length];
//
//        for (int i = 0; i < textArray.length; i++) {
//            toReturn[i] = (char) ((byte) textArray[i] ^ (byte) passwordArray[i % passwordArray.length]);
//        }
//        return String.valueOf(toReturn);
//    }
//}
///*
// SimpleBlowfish blowfish = new SimpleBlowfish();
//        Assert.assertEquals("", blowfish.encrypt("",""));
//        Assert.assertEquals("", blowfish.encrypt("","tandy"));
//        Assert.assertEquals("tandy", blowfish.encrypt("tandy",""));
//        Assert.assertEquals(blowfish.encrypt("a", "a"), blowfish.encrypt("a","abc"));
//        Assert.assertEquals(blowfish.encrypt("ab", "ab"), blowfish.encrypt("ab","abcbb"));
//        char[] expected = {24929, 24930, 24931};
//        Assert.assertTrue(Arrays.equals(expected, blowfish.encrypt("abc", "a").toCharArray()));
//        expected = new char[]{18259, 21104, 17785, 16672, 21611, 18281, 21108};
//        Assert.assertTrue(Arrays.equals(expected, blowfish.encrypt("Spy kit", "GREAT").toCharArray()));
//    }
// */