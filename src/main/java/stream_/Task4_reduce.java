package Stream;

import java.util.Arrays;
import java.util.List;

public class Task4_reduce {
    public static void main(String[] args) {
        /*Произведение чисел
        Дан список чисел [2, 3, 4, 5]. Найди их произведение с помощью reduce.
        List<Integer> nums = Arrays.asList(2, 3, 4, 5);
        int warhorseNums = nums.stream().reduce((a, e) -> a*e).get();
        System.out.println(warhorseNums);*/

        /*Самое длинное слово
        Дан список строк ["apple", "banana", "cherry", "grape"].
        Найди самую длинную строку с помощью reduce.
        List<String> str = Arrays.asList("apple", "banana", "cherry", "grape");
        String strLenghtMax = str.stream().reduce("", (a,e) ->
                e.length() >= a.length() ? e : a);
        System.out.println(strLenghtMax);*/

        /*Конкатенация строк
        Дан список строк ["Hello", " ", "world", "!"].
        Объедини их в одну строку с помощью reduce.
        List<String> str = Arrays.asList("Hello", " ", "world", "!");
        String str2 = str.stream().reduce("", (a, e) -> a+e);
        System.out.println(str2);*/

        /*🔹 reduce()
        Найди сумму всех чисел в списке.
        List<Integer> nums = Arrays.asList(2, 3, 4, 5);
        int numsSum = nums.stream().reduce(0,(a, e) -> a+e);
        System.out.println(numsSum);

        Найди самое длинное слово в списке строк.
        List<String> str = Arrays.asList("fdfs", "s", "mtciwra", ",sqorw", "dwethg", "ssew");
        String str2 = str.stream()
                .reduce("", (a, e) -> e.length() > a.length() ? e : a);
        System.out.println(str2);
         */

        /*✅ reduce():
        Найди сумму всех элементов списка.
         */
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int sumNums = numbers.stream().reduce((a, e) -> a+e).get();
        System.out.println(sumNums);


    }
}
