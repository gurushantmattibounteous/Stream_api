import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class str_demo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", null, "stream", "api", null, "code");

        List<String> result = names.stream()
                .filter(s -> s != null) // remove nulls
                .map(String::toUpperCase) // convert to uppercase
                .collect(Collectors.toList()); // collect into list

        System.out.println(result);
    }
}