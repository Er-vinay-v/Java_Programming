package Date_time;

enum Result{
    PASS,FAIL,NR;
    int marks;
    void Result(){
        System.out.println("constructor in enum");

    }
    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){
        return marks;
    }
}
public class LaunchEnum2 {
    public static void main(String[] args) {
        Result.PASS.setMarks(45);
        int m1=Result.PASS.getMarks();
        System.out.println(m1);

        Result.FAIL.setMarks(44);
        int m2=Result.FAIL.getMarks();
        System.out.println(m2);

    }
}
