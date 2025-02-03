package Stream.Complex_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        /*несколько задач, чтобы повторить `map()`, `filter()`, `forEach()` и `reduce()`.
        ### 🔥 **Комплексные задачи:***/

        /*1️⃣ **Отфильтровать и преобразовать:**
           Дан список чисел `[3, 12, 5, 18, 7, 20, 15]`.
           - Оставь только чётные числа.
           - Умножь их на 3.
           - Выведи каждый результат в консоль.
        List<Integer> nums = Arrays.asList(3, 12, 5, 18, 7, 20, 15);
        List<Integer> res = nums.stream().filter(e -> e %2 == 0).map(e -> e*3).collect(Collectors.toList());
        System.out.println(res);*/


        /*2️⃣ **Поиск максимального четного числа:**
           Дан список `[9, 4, 11, 16, 23, 8, 42, 15]`.
           - Оставь только чётные числа.
           - Найди среди них максимальное.
        List<Integer> nums = Arrays.asList(9, 4, 11, 16, 23, 8, 42, 15);
        int evenNum = nums.stream().filter(e -> e %2 == 0).reduce((a, e) -> e > a ? e : a).get();
        System.out.println(evenNum);*/

       /* 3️⃣ **Средняя длина слов:**
           Дан список строк `["java", "stream", "api", "functional", "lambda"]`.
           - Преобразуй список в длины слов.
           - Найди среднее значение длины слов.
        List<String> str = Arrays.asList("java", "stream", "api", "functional", "lambda");
        int sum = str.stream().map(e -> e.length())
                .reduce(0, (a, e) -> e+a);
        double avgLength = (double)sum / str.size();
        System.out.println(avgLength);*/

        /*4️⃣ **Самое короткое слово с первой буквой "a":**
           Дан список `["apple", "banana", "apricot", "grape", "avocado"]`.
           - Оставь только те слова, которые начинаются с "a".
           - Найди среди них самое короткое.
        List<String> str = Arrays.asList("apple", "banana", "apricot", "grape", "avocado");
        List<String> str2 = str.stream().filter(e->e.charAt(0) == 'a' ).collect(Collectors.toList());
        System.out.println(str2);*/


    }
}
