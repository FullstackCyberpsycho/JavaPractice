package stream_.complex_tasks;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 5, 25);
        System.out.println(maxElement(nums));
    }

    public static int maxElement(List<Integer> nums) {
        return nums.stream().reduce(Integer::max).get();
    }
}
