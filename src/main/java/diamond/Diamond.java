package diamond;

public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("b");
        for (int i = n; i == 1; i = i - 2) {

        }
        stringBuilder.append("c");
        stringBuilder.insert(0, "a");

        // TODO your code here
        return stringBuilder.toString();
    }
}
