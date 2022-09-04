import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] test3 = {"1, 2, 0", "4, 5"};
        List<String> input = List.of("Maks", "Anna", "Taras", "Petro", "Valera", "Mark", "Olga", "Zina");
        List<Integer> test4 = List.of(6, 7, 3, 4, 9, 0);
        List<Integer> test5 = List.of(6, 8, 2, 9);

        System.out.println(Task1.getOddNames(input));

        System.out.println(Task2.getUpperSortedReverseNames(input));

        System.out.println(Task3.getParseIntStr(test3));

        System.out.println(Task4.task4(2L, 25214903917L, 11L, 2 ^ 48L).limit(10).collect(Collectors.toList()));

        System.out.println(Task5.zip(test4.stream(), test5.stream()).collect(Collectors.toList()));
    }
}