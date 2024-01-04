package Thread;

import java.util.Scanner;

class calci implements Runnable {
    public void run(){
        System.out.println("calculation task started");
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter first number");
        int a=sc.nextInt();

        System.out.println("enter second number");
        int b=sc.nextInt();

        int res=a+b;
        System.out.println("Some of two integer is : "+res);
        System.out.println("calculation take ended");

        System.out.println("**********************************");
    }
}
class Message1 implements Runnable{
    public void run(){
        System.out.println("displaying important message task");
        try {
            for (int i=0;i<3;i++){
                System.out.println("Always focus on career growth");
                Thread.sleep(2000);
            }
        }catch (Exception e){
            System.out.println("errors"+e);
        }

        System.out.println("Display important message task ended");

        System.out.println("******************************************");
    }
}
public class LaunchMulti_thread3 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        calci c1=new calci();
        Message1 m1=new Message1();

        Thread t1=new Thread(c1);
        Thread t2=new Thread(m1);
        t1.start();
        t2.start();
    }
}
