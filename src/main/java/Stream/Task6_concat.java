package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6_concat {
    public static void main(String[] args) {
        /*Практические задачи
    Объединение потоков чисел:

    Создай два списка целых чисел, например: [1, 2, 3] и [4, 5, 6].
    Объедини их с помощью Stream.concat().
    Собери объединённый поток в список и выведи результат.
    Stream<Integer> nums1 = Stream.of(1,2,3);
        Stream<Integer> nums2 = Stream.of(4,5,6);
        Stream<Integer> res = Stream.concat(nums1, nums2);
        res.forEach(System.out::print);

    Фильтрация объединённого потока:
    Объедини два потока строк.
    Отфильтруй объединённый поток так, чтобы остались только строки, начинающиеся на букву "a".
    Собери результат в список и выведи его.
    Stream<String> str1 = Stream.of("fkrk", "qmedw", "adkw", "fe", "agry", "adfds");
        Stream<String> str2 = Stream.of("nurj", "ader", "gdfg", "hdd", "abnf", "dsa");
        List<String> strRes = Stream.concat(str1, str2)
                .filter(el -> el.charAt(0) == 'a')
                .collect(Collectors.toList());
        System.out.println(strRes);

    Сортировка объединённого потока:
    Объедини два потока строк.
    Отсортируй объединённый поток (например, по алфавиту).
    Выведи отсортированный список.
    Stream<String> str1 = Stream.of("fkrk", "qmedw", "adkw", "fe", "agry", "adfds");
        Stream<String> str2 = Stream.of("nurj", "ader", "gdfg", "hdd", "abnf", "dsa");
        List<String> strSort = Stream.concat(str1, str2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(strSort);
         */












    }
}
