import java.util.*;

public class CollectionsClassDemo {
    public static void main(String[] args) {
        //Collections --> It is a class in java which offers certain methods to work with
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(90);

        System.out.println("Before sorting : " + list);
        Collections.sort(list);
        System.out.println("After sorting : " + list);
    }
}
