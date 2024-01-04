package OOps_in_java;

public class student_class {
 //student classes are created in next student file bcz if we are creating multiple similar types of classes then
    // cant be creates a similar type class (package will be same then this method is valid)
  public static class car{
      String name;
      char symbol;
      int power;
      double price ;
  }
    public static void main(String[] args) {
//        Stu x=new Stu("vinay", 45, 89.34);
////        x.name="vinay";
////        x.roll_no=43;
////        x.percentage=84.89;
//        System.out.println("Student name : "+x.name);
//        System.out.println("Student roll_no : "+x.roll_no);
//        System.out.println("Obtained percentage :"+x.percentage);
//
//        Stu x1=new Stu("Donald",24,89.23);
////        x1.name="Donald";
////        x1.roll_no=14;
////        x1.percentage=80.86;
//        System.out.println("Student name : "+x1.name);
//        System.out.println("Student roll_no : "+x1.roll_no);
//        System.out.println("Obtained percentage :"+x1.percentage);


        System.out.println("ABOUT CARS DETAILS");
        car c1=new car();
        c1.name="bmw";
        c1.symbol='W';
        c1.power=3000;
        c1.price=5000000.75;

        car c2=new car();
        c2.name="Benz";
        c2.symbol='B';
        c2.power=5000;
        c2.price=8000000.23;

        System.out.println("Car name is :"+c1.name);
        System.out.println("Symbol : "+c1.symbol);
        System.out.println("power of car is :"+c1.power);
        System.out.println("Car price is :"+c1.price);

        System.out.println("Car name is :"+c2.name);
        System.out.println("Symbol : "+c2.symbol);
        System.out.println("power of car is :"+c2.power);
        System.out.println("Car price is :"+c2.price);


    }
}
