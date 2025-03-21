package stream_.complex_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DividingNumbersIntoEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Map<Boolean, List<Integer>> res = nums.stream()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0));
        System.out.println(res);
    }
}
