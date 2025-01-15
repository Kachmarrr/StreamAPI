import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> words = List.of("Apple", "Banana", "Apricot", "Cherry");

        List<String> sortedWords = words.stream()
                .filter(word -> word.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedWords);
    }
}
