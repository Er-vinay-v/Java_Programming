package If_else_statements;
import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the obtain percentage in class 10th:");
        float a=sc.nextFloat();
        if(a>91) System.out.println("Excellent performance.");
        else if(a>81) System.out.println("Very good performance.");
        else if(a>71) System.out.println("good performance.");
        else if(a>61) System.out.println("can do better.");
        else if(a<40) System.out.println("fail.");
    }
}
