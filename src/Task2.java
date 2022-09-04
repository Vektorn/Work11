import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> getUpperSortedReverseNames(List<String> input) {

        return input.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .toList();
    }
}
