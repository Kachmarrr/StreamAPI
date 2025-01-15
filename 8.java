import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> two = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> one = nums.stream()
                .filter(n -> n % 2 == 1)
                .toList();

        System.out.println("{парні: " + two + ", непарні: " + one + "}");
    }
}
