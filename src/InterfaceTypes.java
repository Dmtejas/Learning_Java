
//Normal Interface
interface Normal {
    void method();
    void show();
}

//Functional Interface / SAM -> Single abstract method
@FunctionalInterface
interface SAM {
    //It has only single method
    //void show(int i);
    int add(int a, int b);
}

//Marker Interface
interface Marker {
    //No methods
}

public class InterfaceTypes {
    public static void main(String[] args) {

//        //This is one way of doing it
//        //Instantiating SAM using anonymous inner class
//        SAM obj = new SAM() {
//            public void show() {
//                System.out.println("In Show");
//            }
//        };
//
         //This is another way of doing it --> Using lambda expressions
        //I think it is somewhat similar to Javascript Arrow functions
//        SAM obj = (i) -> {
//            System.out.println("In show");
//        };
//        obj.show(20);

        //Let's see how to use lambda expressions for the functions that return some value

        SAM obj = (a, b) -> {
            return a+b;
        };

        SAM obj2 = (a, b) -> a+b;
        System.out.println(obj.add(10,20));
        System.out.println(obj2.add(10,20));
    }
}
