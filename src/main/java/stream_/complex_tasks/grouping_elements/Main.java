package stream_.complex_tasks.grouping_elements;

import java.util.*;

import static stream_.complex_tasks.grouping_elements.Grouping.groupingAge;
import static stream_.complex_tasks.grouping_elements.Grouping.groupingLength;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Microshelik", 1));
        people.add(new Person("Hyperchelik", 999));
        people.add(new Person("Denis", 19));
        people.add(new Person("Javist", 30));
        people.add(new Person("Hitler", 55));
        people.add(new Person("Putin", 72));
        people.add(new Person("Cheburashka", 58));

        System.out.println(groupingAge(people));

        List<String> words = Arrays.asList("cat", "dog", "elephant", "fox", "antelope");
        System.out.println(groupingLength(words));


    }
}
