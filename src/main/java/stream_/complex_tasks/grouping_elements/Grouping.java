package stream_.complex_tasks.grouping_elements;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static String groupingAge(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> person.getName())
                .collect(Collectors.toList()).toString();
    }

    public static Map<Integer, List<String>> groupingLength(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(el -> el.length()));
    }
}
