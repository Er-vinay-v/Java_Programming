package Thread;

class Libraries implements Runnable{
    String s1=new String("java");
    String s2=new String("SQL");
    String s3=new String("DSA");

    public void run(){
String name=Thread.currentThread().getName();
if (name.equals("Student1")){
    try {
        Thread.sleep(3000);
        synchronized (s1){
            System.out.println("Student1 has acc"+s1);
            Thread.sleep(3000);
            synchronized (s2){
                System.out.println("student1 has acc"+s2);
                Thread.sleep(3000);
                synchronized (s3){
                    System.out.println("student1 has acc"+s3);
                    Thread.sleep(3000);
                }
            }
        }
    }catch (Exception e){
        System.out.println("error"+e);
    }
}
else{
    try {
        Thread.sleep(3000);
        synchronized (s1){
            System.out.println("Student1 has acc"+s1);
            Thread.sleep(3000);
            synchronized (s2){
                System.out.println("student1 has acc"+s2);
                Thread.sleep(3000);
                synchronized (s3){
                    System.out.println("student1 has acc"+s3);
                    Thread.sleep(3000);
                }
            }
        }
    }catch (Exception e){
        System.out.println("error"+e);
    }
}
    }
}
public class LaunchMulti_thread6 {
    public static void main(String[] args) {
        Libraries l=new Libraries();
        Thread t1=new Thread(l);
        Thread t2=new Thread(l);
       // Thread t3=new Thread(l);

        t1.setName("Student1");
        t2.setName("Student2");

        t1.start();
        t2.start();
       // t3.start();
    }
}
