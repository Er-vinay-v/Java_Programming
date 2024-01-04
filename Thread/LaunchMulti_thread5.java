package Thread;

class car implements Runnable{
    synchronized public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+"Has entered the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"got into car to driver");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"came back and park the car");
            System.out.println();
        }
        catch (Exception e){
            System.out.println("error"+e);

        }
    }
}
public class LaunchMulti_thread5 {
    public static void main(String[] args) {
        car c1=new car();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c1);
        Thread t3=new Thread(c1);
        t1.setName("sun1");
        t2.setName("sun2");
        t3.setName("sun3");
        t1.start();
        t2.start();
        t3.start();

    }
}
