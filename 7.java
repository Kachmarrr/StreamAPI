import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> words = List.of("hello", "world");

        List<String> uniqueLetters = words.stream()
                .map(String::toLowerCase)
                .map(x -> x.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueLetters);
    }
}
