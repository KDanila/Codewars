package main.java.fakebinary;

import java.util.stream.Stream;

/*
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        Stream<Character> characterStream = numberString.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isDigit)

        return "";
    }
}
