import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4);

        int sumOfSqrl = numbers.stream()
                .mapToInt(n -> n * n).sum();

        System.out.println(sumOfSqrl);

    }
}
