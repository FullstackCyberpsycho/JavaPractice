package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2_filter {
    public static void main(String[] args) {

        /*Задача 1: Отбор четных чисел
        У тебя есть список чисел. Оставь только четные числа.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNums = numbers.stream().filter(elem -> elem %2 == 0).collect(Collectors.toList());
        System.out.println(evenNums);*/

        /*Задача 2: Фильтр по длине строк
        Дан список строк. Оставь только те строки, длина которых больше 3.
        List<String> words = Arrays.asList("cat", "elephant", "dog", "tree");
        List<String> words2 = words.stream().filter(elem -> elem.length() > 3).collect(Collectors.toList());
        System.out.println(words2);*/

        /*Задача 3: Отбор чисел больше 10
        У тебя есть массив чисел. Оставь только те числа, которые больше 10.
        int[] numbers = {5, 12, 7, 18, 3, 21};
        numbers = Arrays.stream(numbers).filter(elem -> elem > 10).toArray();
        System.out.println(Arrays.toString(numbers));*/

        /*Задача 4: Удаление пустых строк
        Дан список строк, среди которых есть пустые. Убери все пустые строки.
        List<String> words = Arrays.asList("java", "", "stream", "", "filter");
        List<String> words2 = words.stream().filter(elem -> elem != "").collect(Collectors.toList());
        System.out.println(words2);*/

        /*Задача 5: Фильтрация по первой букве
        У тебя есть список строк. Оставь только те строки, которые начинаются с буквы 'a'.
        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape");
        List<String> words2 = words.stream().filter(elem -> elem.charAt(0) == 'a').collect(Collectors.toList());
        System.out.println(words2);*/

        /*Задача 6: Отбор отрицательных чисел
        У тебя есть массив чисел. Оставь только отрицательные числа.
        int[] numbers = {-3, 7, -1, 4, -8};
        numbers = Arrays.stream(numbers).filter(e->e < 0).toArray();
        System.out.println(Arrays.toString(numbers));*/

        /*Задача 7: Фильтрация по четным индексам
        Дан список чисел. Оставь только числа с чётными индексами.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> numEven = numbers.stream().filter(e -> numbers.indexOf(e) % 2 == 0).collect(Collectors.toList());
        System.out.println(numEven);*/

        /*Фильтрация по чётности и делению на 3:
        Дан список чисел. Оставь только те, которые чётные и делятся на 3.
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12, 15, 20);
        List<Integer> numRes = numbers.stream().filter(e -> e % 2 == 0 && e % 3 == 0).collect(Collectors.toList());
        System.out.println(numRes);*/

        /*Фильтрация по длине строки и первой букве: У тебя есть список строк. Оставь только те строки, которые:
        начинаются с буквы 'a', и длина строки больше 3.
        List<String> words = Arrays.asList("apple", "ant", "banana", "apricot", "avocado");
        List<String> words2 = words.stream().filter(e->e.charAt(0) == 'a').filter(e->e.length() > 3)
                .collect(Collectors.toList());
        System.out.println(words2);*/

        /*Фильтрация по числам в диапазоне:
        Дан массив чисел. Оставь только те, которые находятся в диапазоне от 10 до 50 включительно.
        int[] numbers = {5, 12, 7, 18, 30, 40, 60, 45};
        numbers = Arrays.stream(numbers).filter(e-> e > 10 && e < 50).toArray();
        System.out.println(Arrays.toString(numbers));*/

        /*Удаление пустых строк и строк длиной менее 4 символов:
        у тебя есть список строк. Удали все пустые строки и строки, длина которых меньше 4 символов.
        List<String> words = Arrays.asList("java", "", "stream", "", "api", "cat");
        List<String> words2 = words.stream().filter(e-> e != "" && e.length() < 4).collect(Collectors.toList());
        System.out.println(words2);*/

        /*🔹 filter()
        Оставь в списке только четные числа.
        List<Integer> nums = Arrays.asList(5,1,7,4,8,3,0,8,14,2);
        List<Integer> numsEven = nums.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(numsEven);

        Удали из списка пустые строки.
        List<String> strs = Arrays.asList("d", "Dd", "", "ffs", "S", "", "", "r");
        List<String> strsRes = strs.stream().filter(e -> e != "").collect(Collectors.toList());
        System.out.println(strsRes);
         */

        /*✅ filter():
        Оставь в списке только те строки, которые начинаются с "J".
         */
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C++");
        List<String> words2 = words.stream().filter(el -> el.charAt(0) == 'J').collect(Collectors.toList());
        System.out.println(words2);


    }
}
