package stream.complex_tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UniqueWordsClassTest {

    @Test
    void getUniqueWords() {
        String input = "banana apple apple cat dog banana";
        List<String> expected = Arrays.asList("apple", "banana", "cat", "dog");
        UniqueWordsClass a = new UniqueWordsClass();
        Assertions.assertEquals(expected, a.getUniqueWords(input));
    }
}