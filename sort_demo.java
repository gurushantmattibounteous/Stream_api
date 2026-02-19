import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sort_demo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(9, 3, 7, 1, 5, 2);

        List<Integer> sorted = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}