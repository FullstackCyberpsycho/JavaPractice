package Stream.Complex_tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueWordsTest {
    @Test
    void testUniqueWords() {
        String input = "apple banana apple cat dog banana";
        List<String> expected = Arrays.asList("apple", "banana", "cat", "dog");
        Assertions.assertEquals(expected, UniqueWords.getUniqueWords(input));
    }
}
