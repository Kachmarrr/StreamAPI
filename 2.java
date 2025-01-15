import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> words = List.of("Java", "Stream", "Practice");

        List<Integer> lengthWords = words.stream().map(String::length).collect(Collectors.toList());

        System.out.println(lengthWords);
        
    }
}
