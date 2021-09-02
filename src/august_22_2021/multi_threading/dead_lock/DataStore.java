package august_22_2021.multi_threading.dead_lock;

public class DataStore {

    private static int data = 1;

    public static synchronized void setData(int data) {
        DataStore.data = data;
    }

    public static synchronized int getData() {
        return DataStore.data;
    }

}
