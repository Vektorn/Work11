import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static String getParseIntStr(String[] input) {
        return Arrays.stream(input)
                .flatMap(s -> Stream.of(s.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
