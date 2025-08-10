interface Base {
    int age = 10;
    String name = "";
    void show();
}

interface X  {
    void run();
}

class Child implements Base,X {

    public void run() {
        System.out.println("In Run");
    }

    public void show() {
        System.out.println("In Child defining the show");
    }
}


public class InterfacesDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        System.out.println(Base.age);

    }
}
