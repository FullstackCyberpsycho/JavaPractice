package stream.complex_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWordsClass {

    private static final String SPACE = " ";

    public List<String> getUniqueWords(String text) {
        return Arrays.stream(text.split(SPACE))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
