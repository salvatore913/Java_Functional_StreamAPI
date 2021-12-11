import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "maybe your ad could be here";
        Function<String, List<String>> function = (a) ->
                Arrays.stream(a.split(" "))
                        .sorted()
                        .distinct()
                        .toList();
        function.apply(text)
                .forEach(System.out::println);
    }
}
//Использовала реализацию функционального интерфейса Function и монады в виде Stream API.