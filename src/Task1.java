import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static String getOddNames(List<String> input) {

        return IntStream.range(0, input.size())
                .filter(index -> index % 2 == 1)
                .mapToObj(index1 -> index1 + " " + input.get(index1))
                .collect(Collectors.joining(", "));
    }
}
