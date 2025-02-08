package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1_map {
    public static void main(String[] args) {
        /*задание 1: преобразование в верхний регистр
        есть список строк. преобразуй каждую строку в верхний регистр.
        list<string> list = arrays.aslist("hello", "world", "java");
        list<string> list2 = list.stream().map(e -> e.touppercase()).collect(collectors.tolist());
        system.out.println(list2);*/

        /*длина строк
        есть список строк. найди длину каждой строки и верни список чисел.
        list<string> list = arrays.aslist("cat", "elephant", "dog");
        list<integer> list2 = list.stream().map(e->e.length()).collect(collectors.tolist());
        system.out.println(list2);*/

        /*есть список чисел. увеличь каждое число в 2 раза.
        list<integer> numbers = arrays.aslist(1, 2, 3, 4);
        list<integer> numbers2 = numbers.stream().map(e->e*2).collect(collectors.tolist());
        system.out.println(numbers2);*/

        /*извлечение первых букв
        есть список слов. получи список первых букв каждого слова.
        list<string> list = arrays.aslist("java", "stream", "api");
        list<character> list1 = list.stream().map(e->e.charat(0)).collect(collectors.tolist());
        system.out.println(list1);*/

        /*задание 5: чётные и нечётные
        есть список чисел. верни список строк, где будет указано "четное"
        или "нечетное" для каждого числа.
        list<integer> numbers = arrays.aslist(1, 2, 3, 4, 5);
        list<string> evens = numbers.stream().map(e->{
            string even;
            system.out.print(e);
            if (e %2 == 0) {
                even = e + " - четное";
            } else {
                even = e + " - нечетное";
            }
            return even;
        }).collect(collectors.tolist());
        system.out.println(evens);*/

        /*задание 6: возведение в квадрат
        есть массив чисел. возведи каждое число в квадрат и верни массив.
        int[] numbers = {1, 2, 3, 4};
        numbers = arrays.stream(numbers).map(e->e*e).toarray();
        system.out.println(arrays.tostring(numbers));*/

        /*🔹 map()
        преобразуй список строк в список их длин.
        list<string> str = arrays.aslist("qwerty", "plm", "zxcdw", "adgjl");
        list<integer> strlength = str.stream().map(e -> e.length()).collect(collectors.tolist());
        system.out.println(strlength);

        преобразуй список чисел, возведя каждое в квадрат.
        list<integer> nums = arrays.aslist(4,8,1,5,23,8,5,3);
        list<integer> numres = nums.stream().map(e -> e*e).collect(collectors.tolist());
        system.out.println(numres);*/

        /*✅ map():
        преобразуй список чисел, умножив каждое на 2.*/
        list<integer> numbers = arrays.aslist(1, 2, 3, 4, 5);
        list<integer> result = numbers.stream().map(el->el*2).collect(collectors.tolist());
        system.out.println(result);





    }
}
