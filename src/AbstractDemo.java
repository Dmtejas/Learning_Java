


abstract class Car2 {
    public abstract void drive();

    public void show() {
        System.out.println("Inside abstract class");
    }
}

class Swift extends Car2 {
    public void drive() {
        System.out.println("I'm driving the car");
    }
}



public class AbstractDemo {
    public static void main(String[] args) {
        Swift obj = new Swift();
        obj.drive();
    }
}


