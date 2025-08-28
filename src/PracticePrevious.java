public class PracticePrevious {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    System.out.println("Hii");
                    try {
                        Thread.sleep(200);
                    } catch(InterruptedException e) {
                        System.out.println("Exception occurred cannot make the thread to sleep");
                    } catch(Exception e) {
                        System.out.println("Some exception occurred");
                    }
                }


            }
        };

        Runnable obj1 = () -> {
            for(int i=0;i<10;i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(200);
                } catch(InterruptedException e) {
                    System.out.println("Exception occurred cannot make the thread to sleep");
                } catch(Exception e) {
                    System.out.println("Some exception occurred");
                }
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        Thread.sleep(100);
        t2.start();

    }
}
