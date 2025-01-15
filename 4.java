import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(5, 12, 7, 19, 3);

        int maxNumber = numbers.stream()
                .max(Integer::compare)
                .get();

        System.out.println(maxNumber);

    }
}
