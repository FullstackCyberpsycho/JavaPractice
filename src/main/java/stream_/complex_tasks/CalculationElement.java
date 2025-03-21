package stream_.complex_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculationElement {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple", "banana", "apple", "apple", "banana", "cat");
        Map<String, Long> res = str.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(res);
    }
}
