package Date_time;

enum Week{
    MON,TUE,WED,THR,FRI,SAT,SUN;
}
public class LaunchEnum {
    enum Result{
        PASS,FAIL,NR;
    }
    enum Colour{
        RED,YELLOW,GREEN,PINK,VILOTE,SKEYBLUE;
    }
    public static void main(String[] args) {
        Week w=Week.MON;
        System.out.println(w);
        Result r=Result.PASS;
        System.out.println(r);
        Colour  c=Colour.PINK;
        System.out.println(c);
    }
}
