class E implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(200);
            } catch(InterruptedException e) {
                System.out.println("Error occurred");
            }
        }
    }
}

class F implements Runnable {
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(200);
            } catch(InterruptedException e) {
                System.out.println("Error occurred");
            }
        }
    }
}


public class ThreadsWithRunnable {
    public static void main(String[] args) {
        E obj1 = new E();
        F obj2 = new F();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {
            System.out.println("Error occurred");
        }
        t2.start();
    }
}
