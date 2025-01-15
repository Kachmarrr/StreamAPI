import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("Bob", 72),
                new Student("Charlie", 90)
        );

        int counter = (int) students.stream()
                .filter(n -> n.getScore() > 75)
                .count();


        double arithmeticMean = students.stream()
                .filter(n -> n.getScore() > 75)
                .mapToInt(Student::getScore)
                .sum();

        System.out.println(arithmeticMean / counter);
        System.out.println(counter);

    }
}
