import java.util.Arrays;
import java.util.function.Consumer;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        Consumer<String> task = n -> {
            if (StringUtils.isPositiveNumber(n)) {
                System.out.println(n + " - positive number.");
            } else {
                System.out.println(n + " - not positive number.");
            }
        };
        return Arrays.stream(str).peek(task).allMatch(StringUtils::isPositiveNumber);
    }
}
