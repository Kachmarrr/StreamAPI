import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> words = List.of("java", "stream", "api");

        List<String> upperCase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCase);

    }
}
