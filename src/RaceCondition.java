class Counter {
    int count;

    //Synchronized ----> This prevents threads to call the method simultaneously
    public synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    //Race condition occurs when multiple threads tries to access the same resource (Methods)
    //To avoid this we use synchronized keyword in the method signature

    public static void main(String[] args) throws InterruptedException {
        Counter obj = new Counter();

        Runnable r1 = () -> {
            for(int i=0;i<10000;i++) {
                obj.increment();
            }
        };

        Runnable r2 = () -> {
            for(int i=0;i<10000;i++) {
                obj.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.count);
    }
}
