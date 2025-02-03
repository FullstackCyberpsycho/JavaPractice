package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1_map {
    public static void main(String[] args) {
        /*Задание 1: Преобразование в верхний регистр
        Есть список строк. Преобразуй каждую строку в верхний регистр.
        List<String> list = Arrays.asList("hello", "world", "java");
        List<String> list2 = list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
        System.out.println(list2);*/

        /*Длина строк
        Есть список строк. Найди длину каждой строки и верни список чисел.
        List<String> list = Arrays.asList("cat", "elephant", "dog");
        List<Integer> list2 = list.stream().map(e->e.length()).collect(Collectors.toList());
        System.out.println(list2);*/

        /*Есть список чисел. Увеличь каждое число в 2 раза.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> numbers2 = numbers.stream().map(e->e*2).collect(Collectors.toList());
        System.out.println(numbers2);*/

        /*Извлечение первых букв
        Есть список слов. Получи список первых букв каждого слова.
        List<String> list = Arrays.asList("java", "stream", "api");
        List<Character> list1 = list.stream().map(e->e.charAt(0)).collect(Collectors.toList());
        System.out.println(list1);*/

        /*Задание 5: Чётные и нечётные
        Есть список чисел. Верни список строк, где будет указано "четное"
        или "нечетное" для каждого числа.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> evens = numbers.stream().map(e->{
            String even;
            System.out.print(e);
            if (e %2 == 0) {
                even = e + " - четное";
            } else {
                even = e + " - нечетное";
            }
            return even;
        }).collect(Collectors.toList());
        System.out.println(evens);*/

        /*Задание 6: Возведение в квадрат
        Есть массив чисел. Возведи каждое число в квадрат и верни массив.
        int[] numbers = {1, 2, 3, 4};
        numbers = Arrays.stream(numbers).map(e->e*e).toArray();
        System.out.println(Arrays.toString(numbers));*/

        /*🔹 map()
        Преобразуй список строк в список их длин.
        List<String> str = Arrays.asList("qwerty", "plm", "zxcdw", "adgjl");
        List<Integer> strlength = str.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(strlength);

        Преобразуй список чисел, возведя каждое в квадрат.
        List<Integer> nums = Arrays.asList(4,8,1,5,23,8,5,3);
        List<Integer> numRes = nums.stream().map(e -> e*e).collect(Collectors.toList());
        System.out.println(numRes);*/

        /*✅ map():
        Преобразуй список чисел, умножив каждое на 2.*/
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream().map(el->el*2).collect(Collectors.toList());
        System.out.println(result);





    }
}
