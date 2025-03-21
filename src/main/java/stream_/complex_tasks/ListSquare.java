package stream_.complex_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListSquare {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4);
        List<Integer> res = nums.stream().map(e -> e*e).collect(Collectors.toList());
        System.out.println(res);
    }
}
