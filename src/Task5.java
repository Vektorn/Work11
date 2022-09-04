import java.util.Iterator;
import java.util.stream.Stream;
public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        Stream<T> result = Stream.empty();
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result = Stream.concat(result, Stream.of(firstIterator.next(), secondIterator.next()));
        }
        return result;
    }
}