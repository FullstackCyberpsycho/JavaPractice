package Stream.Complex_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
   // public static void main(String[] args) {
        /*Фильтрация списка строк
        Описание: Дан список строк. Оставить только те строки, длина которых больше 5 символов, и
        преобразовать их в верхний регистр.*/

        /*List<String> listStr = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        List<String> resStr = listStr.stream()
                .filter(e -> e.length() > 5)
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        System.out.println();*/

   // }

    public String filterAndMap(List<String> listStr) {
        //List<String> listStr = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        List<String> resStr = listStr.stream()
                .filter(e -> e.length() > 5)
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        //System.out.println();
        return resStr.toString();
    }
}
class Main {
    public static void main(String[] args) {
        FilterAndMap filterAndMap = new FilterAndMap();
        List<String> listStr = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        System.out.println(filterAndMap.filterAndMap(listStr));
    }
}

