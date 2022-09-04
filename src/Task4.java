import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> task4(Long seed, Long a, Long c, Long m) {
        return Stream.iterate(new Long[]{seed, a, c, m},
                        n -> new Long[]{(n[1] * n[0] + n[2]) % n[3], n[1], n[2], n[3]})
                .map(n -> n[0]);
    }
}