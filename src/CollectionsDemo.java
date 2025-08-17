import java.util.ArrayList;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        //This is how you create a collection like arrayList
        //List supports Index value
        //It supports duplicate values
//        Set<Integer> list = new HashSet<>();
//        list.add(5);
//        list.add(7);
//        list.add(8);
//        list.add(10);
//        list.add(2);
//        list.add(7);

//        //Collection
//        for(Integer n: list) {
//            System.out.println(n);
//        }
//
//        //List using index
//        for(int i=0;i<list.size();i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println(list);

//        Scanner sc = new Scanner(System.in);
//
//        Collection<Integer> obj = new ArrayList<>();
//        System.out.println("Enter the values into the array list : ");
//        for(int i=0;i<5;i++) {
//            obj.add(sc.nextInt());
//        }
//        System.out.println(obj);



//        //Freshly starting Collections
//        //ArrayList using Collection reference
//        Collection<Integer> col = new ArrayList<Integer>();
//        col.add(20);
//        col.add(40);
//        col.add(3);
//        col.add(10);
//        col.add(50);
//
//        System.out.println(col);
//
//        //Accessing ArrayList with Collection Reference
//        for(int n : col) {
//            System.out.println(n);
//        }
//
//        //But here you cannot access via the index - So we can use List reference ArrayList
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(3);
//        list.add(3);
//        list.add(3);
//        list.add(3);
//        list.add(3);
//        for(int i=0;i<6;i++) {
//            System.out.println(list.get(i));
//        }

//        //To avoid the duplicate elements especially during solving problems we can use Set reference with hashset
//        Collection<Integer> obj = new HashSet<>();
//        obj.add(20);
//        obj.add(1);
//        obj.add(2);
//        obj.add(4);
//
//        for(int n : obj) {
//            //It does not follow the order in which we add the elements
//            System.out.println(n);
//        }
//        //Set doesn't support index value
//
//
//        //To make the set sorted - We can use Tree set
//        Set<Integer> set = new TreeSet<>();
//        set.add(20);
//        set.add(2);
//        set.add(200);
//        //System.out.println("Sorted set :  " + set);  -- or --
//        Iterator<Integer> it = set.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        //Map - It doesn't extends or implements Collection
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 20);
        map.put(2, 40);
        map.put(3, 60);
        System.out.println(map);

        //Using forEach() to iterate through the map
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

        //Get() method to specify the key to get the specific value
        System.out.println(map.get(1));

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
