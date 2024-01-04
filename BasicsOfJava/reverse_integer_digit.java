package BasicsOfJava;
import java.util.*;
public class reverse_integer_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digits");
        int n=sc.nextInt();
        int ans=0;
        while(n!=0){
            ans*=10;
            ans+=n%10;
            n=n/10;
        }
        System.out.println(ans);
    }
}
