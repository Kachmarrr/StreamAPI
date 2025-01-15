import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String text = "Hello, world! Hello Java! hello";

        text = text.replaceAll("\\p{Punct}", "");  // important

        List<String> words = Arrays.asList(text.split(" "));

        Map<String,Integer> sorted  = words.stream()
                .map(String::toLowerCase) // = x -> x.toLowerCase
                .collect( Collectors.groupingBy( Function.identity(), Collectors.summingInt(e -> 1) ));

        System.out.println(sorted);
    }
}
