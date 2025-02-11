package stream.complex_tasks.grouping_elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stream_.complex_tasks.grouping_elements.Grouping;
import stream_.complex_tasks.grouping_elements.Person;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stream_.complex_tasks.grouping_elements.Grouping.groupingAge;

class GroupingTest {
    @Test
    void groupingAgeTest() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Microshelik", 1));
        people.add(new Person("Hyperchelik", 999));
        people.add(new Person("Denis", 19));
        people.add(new Person("Javist", 30));
        people.add(new Person("Hitler", 55));
        people.add(new Person("Putin", 72));
        people.add(new Person("Cheburashka", 58));

        //List<String> res = Arrays.asList("Hyperchelik, Denis, Javist, Hitler, Putin, Cheburashka");

        String expected = groupingAge(people);
        assertEquals("[Hyperchelik, Denis, Javist, Hitler, Putin, Cheburashka]", expected);
    }

    @Test
    void groupingLength() {
        List<String> words = Arrays.asList("cat", "dog", "elephant", "fox", "antelope");
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(3, List.of("cat", "dog", "fox"));
        expected.put(8, List.of("elephant", "antelope"));

        Map<Integer, List<String>> res = Grouping.groupingLength(words);
        assertEquals(expected, res);
    }
}
