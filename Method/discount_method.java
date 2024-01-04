package Method;

public class discount_method {
    static void discount(double...x){
        double sum=0;
        double save=0;
        for (double i:x){
         sum+=i;
        }
        for (int i=0;i<x.length;i++){
            if (sum<=500){
                save=(double) (500*10)/100;
            }
            else if (sum<2000){
                save=(double) (1000*15)/100;
            }
            else {
                save=(double) (2000*20)/100;
            }
        }
        System.out.println("Total price : "+sum);
        System.out.println("you save Rs. : "+save);
        System.out.println("you pay Rs. : "+(sum-save));
    }
    public static void main(String[] args) {
        discount(200,5000,100,150.99);
    }
}
