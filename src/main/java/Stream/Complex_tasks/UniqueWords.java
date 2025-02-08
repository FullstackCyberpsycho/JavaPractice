package Stream.Complex_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {
        String worlds = "apple banana apple cat dog banana";
        System.out.println(getUniqueWords(worlds));
    }

    public static List<String> getUniqueWords(String text) {
        return Arrays.stream(text.split(" "))
                .distinct()
                .sorted().collect(Collectors.toList());
    }
}
