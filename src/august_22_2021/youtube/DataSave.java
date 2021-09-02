package august_22_2021.youtube;

public class DataSave {
    private static int data = 1;

    public static synchronized void incrementData(){
        data++;
    }

    public static int getData() {

        return DataSave.data;
    }
}
