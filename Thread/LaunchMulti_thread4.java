package Thread;

class Example implements Runnable{
    public void run(){
        try {
            System.out.println("focus is important");
            System.out.println("Love is only for generate interruption for your career");
           // Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println("error"+e);
        }
    }

}
public class LaunchMulti_thread4 {
    public static void main(String[] args) {
        Example ex=new Example();
        Thread t1=new Thread(ex);
        t1.start();
        t1.interrupt();
    }
}
