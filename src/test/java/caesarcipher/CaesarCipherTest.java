/*package caesarcipher;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CaesarCipherTest {

    @Test
    public void test0(){
        String u = "I should have known that you would have a perfect answer for me!!!";
        System.out.println((int)('a'));
        System.out.println((int)('z'));
        System.out.println((int)('A'));
        System.out.println((int)('Z'));
        //String ret =shift(u.toCharArray(),1);
        //System.out.println(ret);
    }

    @Test
    public void test1() {
        String u = "I should have known that you would have a perfect answer for me!!!";
        List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 1), 1));
    }

}*/