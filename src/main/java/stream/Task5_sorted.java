package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5_sorted {
    public static void main(String[] args) {
        // Практические задачи:

        /*1️⃣ Отсортируй список строк по алфавиту.
        📌   List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
        List<String> w2 = words.stream().sorted().collect(Collectors.toList());
        System.out.println(w2);*/

        /*2️⃣ Отсортируй список чисел по убыванию.
        📌 List<Integer> numbers = Arrays.asList(4, 9, 1, 7, 3, 8);
        List<Integer> sortNum = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortNum);*/

        /*3️⃣ Отсортируй массив строк по длине слов.
          📌 String[] words = {"elephant", "cat", "dolphin", "fox"};
        String[] words = {"elephant", "cat", "dolphin", "fox"};
        List<String> sortedWords = Arrays.stream(words)
                //.sorted(Comparator.comparingInt(String::length))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedWords);*/

        /* Отсортируй список объектов Person по возрасту.
📌 List<Person> people = List.of(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));
        List<Person5> people = List.of(new Person5("Alice", 30), new Person5("Bob", 25),
                new Person5("Charlie", 35));
        List<Person5> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person5::getAge))
                .collect(Collectors.toList());
        sortedPeople.forEach(System.out::println);*/

        /*🔹 sorted()
        Отсортируй список строк по алфавиту.
        List<String> str = Arrays.asList("banana", "apple", "cherry", "grape");
                List<String> str2 = str.stream().sorted().collect(Collectors.toList());
                System.out.println(str2);

        Отсортируй список чисел по убыванию.
        List<Integer> nums = Arrays.asList(7,1,9,4,0);
        List<Integer> nums2 = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(nums2);
         */

        /*✅ sorted():
        Отсортируй список строк по алфавиту.
         */
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
        List<String> wordsSort = words.stream().sorted().collect(Collectors.toList());
        System.out.println(wordsSort);
    }
}
