import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> numSorted = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numSorted);

    }
}
