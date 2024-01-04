package BasicsOfJava;

public class Add_digit_value {
    public static void main(String[] args) {
        int n=1;
        int ans=0;
        while(n>9) {
            if (n >= 10) {
                ans = n % 10 + n / 10;
                n = ans;
            } else {
                ans = n;
            }

        }
        if(n<10){
            ans=n;
        }
        System.out.println(ans);
    }
}
