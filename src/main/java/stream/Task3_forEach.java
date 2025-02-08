package stream;

import java.util.Arrays;
import java.util.List;

public class Task3_forEach {
    public static void main(String[] args) {
        /*Практические задачи:

    Выведи все элементы списка чисел с их квадратами.
    List<Integer> nums = Arrays.asList(5, 12, 7, 18, 30, 40, 60, 45);
        nums.stream().forEach(el -> {
            el = el*el;
            System.out.println(el);
        });

    Для каждого элемента строки из списка выведи длину строки.
    String[] str = {"ytyrttr", "rer", "kkfkf"};
    Arrays.stream(str).forEach(s -> System.out.println(s.length()));

    Умножь все числа из массива на 2 и выведи результат (без сохранения в массив).
    int[] nums = {5, 12, 7, 18, 30, 40, 60, 45};
    Arrays.stream(nums).forEach(el -> {el *=2; System.out.println(el);});*/

    /*forEach()
    Выведи все элементы списка с их индексами.
    List<String> str = Arrays.asList("rerr", "re", "4rer", "fgrf");
            str.stream().forEach(e -> {
                System.out.println(e + " - " + str.indexOf(e));
            });

    Выведи все элементы списка строк в верхнем регистре.
    List<String> str = Arrays.asList("rerr", "re", "4rer", "fgrf");
        str.stream().forEach(e -> System.out.println(e.toUpperCase()));
     */

        /*✅ forEach():
        Выведи в консоль каждый элемент списка с восклицательным знаком.
         */
        List<String> words = Arrays.asList("Hello", "World", "Java");
        words.stream().forEach(el -> System.out.println(el + "!"));

    }
}
