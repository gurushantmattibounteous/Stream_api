import java.util.Arrays;
import java.util.List;

public class demo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 9, 2, 1);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);
    }
}