package camelcase;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class CamelCase {

    public static String camelCase(String str) {
        return Arrays.stream(str.split(" ")).
                filter(x->!x.equals("")).
                map(x->x.substring(0,1).toUpperCase()+x.substring(1,x.length())).
                collect(Collectors.joining());
    }

}

/*
Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings.
All words must have their first letter capitalized without spaces.

For instance:

camelCase("hello case"); // => "HelloCase"
camelCase("camel case word"); // => "CamelCaseWord"
 */