package OOps_in_java;

public class fraction {
    public static Fraction add(Fraction f1,Fraction f2){
        int numerator=f1.num*f2.den+f2.num*f1.den;
        int denominator=f1.den*f2.den;
        Fraction f3=new Fraction(numerator,denominator);
        return f3;
    }
    public static Fraction mul(Fraction f1,Fraction f2){
        int numerator=f1.num*f2.num;
        int denominator=f1.den*f2.den;
        Fraction f3=new Fraction(numerator,denominator);
        return f3;
    }
    public static Fraction sub(Fraction f1,Fraction f2){
        int numerator=f1.num*f2.den-f2.num*f1.den;
        int denominator=f1.den*f2.den;
        Fraction f3=new Fraction(numerator,denominator);
        return f3;
    }
    static int gcd(int num,int den){
        while(num%den!=0){
            int rem=num%den;
            num=den;
            den=rem;

        }
        return  den;
    }
    public static class Fraction{
        int num;
        int den;

        public Fraction(int num,int den){
            this.num=num;
            this.den=den;
            simplify();
        }
       public  void simplify(){
            int hcf=gcd(num,den);
            num=num/hcf;
            den=den/hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1=new Fraction(5,11);
       // f1.simplify();//aaha se v call kar saktao ho or constructors se v kar sakte ho
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2=new Fraction(7,21);
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3=add(f1,f2);
        System.out.println("Add of two fraction :"+f3.num+"/"+f3.den);
        Fraction f4=mul(f1,f2);
        System.out.println("mul of two fraction :"+f4.num+"/"+f4.den);
        Fraction f5=sub(f1,f2);
        System.out.println("sub of two fraction :"+f5.num+"/"+f5.den);
    }

}
