public class ThreadsWithRunnableLambda {
    public static void main(String[] args) {
//        Runnable obj = new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<5;i++) {
//                    System.out.println("Hi");
//                    try {
//                        Thread.sleep(200);
//                    } catch(InterruptedException e) {
//                        System.out.println("Error occurred");
//                    }
//                }
//
//            }
//        };

        //Using lambda expression
        Runnable obj = () -> {
            for(int i=0;i<5;i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(200);
                    } catch(InterruptedException e) {
                        System.out.println("Error occurred");
                    }
            }
        };

//        Runnable obj1 = new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<5;i++) {
//                    System.out.println("Hello");
//                    try {
//                        Thread.sleep(200);
//                    } catch(InterruptedException e) {
//                        System.out.println("Error occurred");
//                    }
//                }
//            }
//        };

        Runnable obj1 = () -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(200);
                } catch(InterruptedException e) {
                    System.out.println("Error occurred");
                }
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {
            System.out.println("Error occurred");
        }
        t2.start();
    }
}
