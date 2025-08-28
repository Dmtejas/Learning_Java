import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class C extends Thread {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(200);
            } catch(InterruptedException e) {
                System.out.println("Error in applying sleep");
            }
        }

    }
}

class D extends Thread {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(200);
            } catch(InterruptedException e) {
                System.out.println("Error in applying sleep");
            }

        }

    }
}

public class ThreadsDemo {
    public static void main(String[] args) throws IOException {
        C obj = new C();
        D object = new D();

        //The range of the priority goes from 1 to 10
        System.out.println(obj.getPriority());

        //Changing the priority
        object.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {
            System.out.println("Error in applying sleep");
        }
        object.start();

    }
}
