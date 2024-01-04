package OOps_in_java;
import java.util.Scanner;
public class table {
    static void Table(int x){
        for (int i=1;i<=10;i++){
            System.out.println(x+ "*"+i+"="+x*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of table you wants");
        int n=sc.nextInt();
        
       Table(n);
        System.out.println();
       Table(n+1);
        System.out.println();
        Table(n+2);
        System.out.println();
        Table(n+3);
        System.out.println();
        Table(n+4);

    }
}
