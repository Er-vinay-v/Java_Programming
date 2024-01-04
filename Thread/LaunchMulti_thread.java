package Thread;

class MyThread extends Thread{
    public void run(){
        System.out.println("child thread");
    }
}
public class LaunchMulti_thread {
    public static void main(String[] args) {
        System.out.println("main thread");
        MyThread t=new MyThread();
       // t.run(); // it cant be call of run method
        t.start();
    }
}
