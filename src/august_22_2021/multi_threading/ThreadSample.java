package august_22_2021.multi_threading;

public class ThreadSample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread: " + Thread.currentThread().getName());

        //
        System.out.println("One");
        Thread.sleep(2000);
        System.out.println("Two");

        Thread t1 = new Thread(() -> {
           try {
               Thread.sleep(5000);
               System.out.println("Thread 1: " + Thread.currentThread().getName());
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        });
        Thread t2 = new Thread(() -> System.out.println("Thread 2: " + Thread.currentThread().getName()));

        t1.start();
        t2.start();
    }

}
