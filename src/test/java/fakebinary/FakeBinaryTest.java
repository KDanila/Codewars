package fakebinary;

import org.junit.jupiter.api.Test;

class FakeBinaryTest {

    @Test
    public void whenStringShouldReturnCorrectRandomValue(){
        String test = "10101001";
        System.out.println(FakeBinary.fakeBin(test));
    }
}