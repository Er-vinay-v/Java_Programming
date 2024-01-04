package Thread;

import java.util.Scanner;

class calculator extends Thread{
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
class Message extends Thread{
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
class greating extends Thread{
    public void run(){
        System.out.println("morning wishes");
        for (int i=0;i<5;i++){
            System.out.println("Hii Donald whatsapp!");
        }
        System.out.println("**************************************");
    }
}
public class LaunchMulti_thread2 {
    public static void main(String[] args) {
        System.out.println("***main thread***");

        calculator t1=new calculator();

        Message t2=new Message();

        greating t3=new greating();

        t1.start();
        t2.start();
        t3.start();



    }
}
