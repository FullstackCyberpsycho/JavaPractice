package stream_.complex_tasks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lists {
    public static void main(String[] args) {
        Stream<String> words1 = Stream.of("apple", "banana");
        Stream<String> words2 = Stream.of("apple", "cherry");
        System.out.println(lists(words1, words2));
    }

    public static List<String> lists(Stream<String> words1, Stream<String> words2) {
        return Stream.concat(words1, words2).distinct()
                .collect(Collectors.toList());
    }
}
