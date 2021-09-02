package august_22_2021.youtube;

public class Views {

    public static void main(String args[]) throws InterruptedException{
        Thread t1 = new Thread(()->{
            try{
                while (true) {
                    Thread.sleep(500);
                    DataSave.incrementData();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()->{
           try{
               while (true){
                   Thread.sleep(500);
                   System.out.println(DataSave.getData());
               }

           }
           catch (Exception e){
               e.printStackTrace();
           }
        });
       t1.start();
       t2.start();
       Thread.sleep(6000);
       System.exit(0);
    }
}
