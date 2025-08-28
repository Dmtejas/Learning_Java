import tools.*;
import java.util.Objects;

class A {
    public void show() {
        System.out.println("In A Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

class Calc {
    public void show() {
        System.out.println("In Calc Show");
    }

    public final int add(int a, int b) {
        return a+b;
    }
}


class AdvCalc extends Calc {
    //Can't do it
//    public int add(int a, int b) {
//
//    }

    @Override
    public void show() {
        System.out.println("Overriding by using override annotation");
    }
}

class  Laptop {
    final private int price;
    final private String model;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model);
    }

    public Laptop() {
        System.out.println("Inside Constructor");
        price = 0;
        model ="";
    }

    public Laptop(int price, String model) {
        this.model = model;
        this.price = price;
    }

    public String toString() {
        System.out.println(price);
        System.out.println(model);
        return "Hey";
    }

    //Not Recommended
//    public boolean equals(Laptop obj) {
//        return this.price == obj.price && Objects.equals(this.model, obj.model);
//    }

}

class Computer {
    public void show1() {
        System.out.println("In Show1");
    }
}

class Abc extends Computer {
    public void show2() {
        System.out.println("In Show2");
    }
}


abstract class Car {

    public abstract void drive();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

//Must override the drive() function
class WagonR extends Car {
    public void drive() {
        System.out.println("I am driving");
    }
}

//Inner classes Demo
class Outer {
    int age;

    public void show() {
        System.out.println("In Show");
    }
    class Inner {
        public void config() {
            System.out.println("In config");
        }
    }
}

class Room {
    private int doors;
    String color;

    public void display() {
        System.out.println("Inside Room class");
    }
}

class Library extends Room {
    public void display() {
        System.out.println("Inside Library class");
    }
}

public class javaPractice {
    public static void main(String[] args) {

        //Example for Access modifier
        //public ----> This allows the method or a variable to be accessed outside the package
        //private ----> This make the method or a variable in the same class that's it
        //Default ----> If nothing specified then variables or methods can be used by the classes of another class in the same package

//        B obj = new B();
//        obj.sayHello();


        //Dynamic Method Dispatch  --> A way to achieve polymorphism (Run-time)
//        A obj = new B();
//        obj.show();
//
//        //This is the way to distinguish the conflict
//        tools.A obj1 = new tools.A();
//        obj1.greet();


        //Final - Method, Class, Variable (Constants ---> Simple)
//        final float PI = 3.143434f;
//        Calc obj = new Calc(); //If it is mentioned as final then class cannot be inherited
//        obj.show();
//        System.out.println(obj.add(2, 3));
//        AdvCalc obj1 = new AdvCalc();

        //Object class overriding
//        Laptop obj = new Laptop(45000, "Lenovo Yoga");
//        System.out.println(obj);
//        System.out.println(obj.toString()); //It converts the address to string called implicitly
//        System.out.println(obj.toString());
//
//        Laptop obj1 = new Laptop(45000, "Lenovo Yoga");
//        System.out.println(obj1.equals(obj));

         //Up-Casting and Down-Casting
//        Computer obj = (Computer) new Abc(); //Up Casting
//        Abc object = (Abc) obj; //Down Casting
//        object.show2();
//        obj.show1();

//        //Auto-Boxing, Un-auto-Boxing
//        //Integer num1 = new Integer(num); //Boxing
//        Integer num1 = 10; //Auto-Boxing
//
//        //int num2 = num1.intValue(); //Unboxing
//        int num2 = num1; //Auto-Un-Boxing
//        System.out.println(num1);
//
//        String str = "12";
//        Integer num3 = Integer.parseInt(str);
//        System.out.println(num3);

//        //Abstract --> Keyword
//        Car obj = new WagonR(); //Dynamic method dispatch
//        obj.drive();
//        obj.playMusic();

//        //Inner class
//        Outer obj = new Outer();
//        Outer.Inner obj1 = new Outer.Inner();
//
//        //Way to access the inner classes
//        Outer demo = new Outer();
//        Outer.Inner demoInner = new Outer.Inner();

//        Outer outerObj = new Outer();
//        Outer.Inner obj = outerObj.new Inner(); //Way to create an object of the inner non static class
//        obj.config();

//        //Up Casting and down casting example
//        Room obj = (Room) new Library();  //Down casting
//        obj.display();
//
//        Library obj1 = (Library) obj;
//        obj1.display();
//
//        Room obj2 = new Room();
//        obj2.display();
//
//        Room obj3 = new Room() {
//            public void display() {
//                System.out.println("Hii");
//            }
//        };
//        obj3.display();
    }
}