package Stream.Complex_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_distinct {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,1,2,3);
        nums.stream().distinct().forEach(System.out::print);
    }
}
