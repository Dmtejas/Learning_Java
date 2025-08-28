
enum Status {
    Running, Pending, Success, Failed
}

enum Laptop1 {
    Macbook(2000), Dell(2200), Lenovo(1600), ThinkPad(3000);

    private int price;

    private Laptop1() {}
    private Laptop1(int price) {
        this.price = price;
    }

    public int get() {
        return this.price;
    }

    public void set(int price) {
        this.price = price;
    }

}

public class EnumsDemo {
    public static void main(String[] args) {
//        //Status s = Status.Running;
//        Status s = Status.Pending;
//        System.out.println(s.ordinal());
//
//        //Assign all the enums
//        Status[] st = Status.values();
//        for(Status n : st) {
//            System.out.println(n.ordinal());
//        }

       Status s = Status.Running;
//        if(s.equals(Status.Running)) {
//            //Do something
//        } else if(s.equals(Status.Pending)) {
//            //Do something
//        } else {
//
//        }

        switch(s) {
            case Running :
                System.out.println("Running");break;
            case Pending :
                System.out.println("Pending");break;
        }
    }
}
