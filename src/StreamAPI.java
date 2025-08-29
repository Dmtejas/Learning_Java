import javax.sql.RowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,4);

        //Creating a stream
        //Stream is used only once like a water stream
        //Main advantage is it gives certain methods like filter()
//        Stream<Integer> s1 = list.stream();
//        Stream<Integer> s2 = s1.filter(n -> {
//            if(n % 2 == 0) {
//                return true;
//            }
//            return false;
//        });
//        s2.forEach(n -> System.out.println(n));
//
//        //Map() method - which gives a stream based on the operation you do
//        Stream<Integer> s3 = list.stream();
//        Stream s4 = s3.map(n -> n*n);
//        s4.forEach(n -> System.out.println(n));
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        //Example of forEach
//        list.forEach(con);

        //Method chaining using streams just like in JavaScript
//        Stream<Integer> s5 = list.stream().filter().map().reduce()


        //filter() method
        Predicate<Integer> pd = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
//        Stream<Integer> s6 = list.stream().filter(pd);
//        s6.forEach(n -> System.out.println(n));


        //stream.map() method
        Function<Integer, Integer> f1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
        Stream<Integer> s7 = list.stream().map(f1);
        s7.forEach(n -> System.out.println(n));

        //stream.reduce() method
        Stream<Integer> s8 = list.stream();
        int result = s8.reduce(0, (c, e) -> c+e);
        System.out.println(result);

        //stream.sorted() --> Which gives sorted values


    }
}
