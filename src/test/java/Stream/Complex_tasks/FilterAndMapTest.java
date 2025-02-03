package Stream.Complex_tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterAndMapTest {
    @Test
    void testFilterAndMap() {
        List<String> listStr = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        /*List<String> resStr = listStr.stream()
                .filter(e -> e.length() > 5)
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());*/
        FilterAndMap filterAndMap = new FilterAndMap();

        List<String> expected = Arrays.asList("BANANA", "ELEPHANT");
        assertEquals(expected, filterAndMap.filterAndMap(listStr));
    }
}
