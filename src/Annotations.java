class Base1 {
    public void show() {
        System.out.println("In A Show");
    }
}

class Child1 extends Base1 {
    //Example for annotations
    @Override
    public void show() {
        System.out.println("In B show");
    }
}

public class Annotations {
    public static void main(String[] args) {

    }
}
