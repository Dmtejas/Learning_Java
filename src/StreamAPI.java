import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,4);

        //Example of forEach
        list.forEach(n -> System.out.println(n));
    }
}
