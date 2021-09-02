package august_22_2021.multi_threading.dead_lock;

import java.util.Random;

public class DeadLock {

    public static void main(String[] args) throws InterruptedException {
        // Changing static context. This will return correct value;
        DataStore.setData(2);
        System.out.println(DataStore.getData());

        Thread t1 = new Thread(() -> {
            try {
                Random random = new Random();
                Thread.sleep(random.nextInt(5)*1000);
                DataStore.setData(5);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                Random random = new Random();
                Thread.sleep(random.nextInt(5)*1000);
                DataStore.setData(7);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        Thread.sleep(6000);
        System.out.println(DataStore.getData());
    }

}
