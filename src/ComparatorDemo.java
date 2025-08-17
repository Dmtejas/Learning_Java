import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        //Comparator object


        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                }
                return -1;
            }
        };

        List<String> list = new ArrayList<>();
        list.add("Tejas");
        list.add("Abhi");
        list.add("Likita");
        list.add("Pavithra");

        Collections.sort(list, com);
        System.out.println("After sorting based on their length : " + list);
    }
}
