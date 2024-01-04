package One_dimensional_array;

public class Array_1 {
    public static void main(String[] args) {
        int a []={12,34,45,56,};
        int b []={6,5,4,3};
        a[0]=56;//array update
        b[2]=34;
        int sum=0;
        int sum1=0;
        int sum2=0;
        for (int i=0;i<=3;i++){
            if (a[i]+b[i]!=0){
                sum1+=b[i];
                sum +=a[i];
                 sum2 +=a[i]+b[i];
            }

        }
        System.out.println("the sum of array a is : "+sum);
        System.out.println("the sum of array b is : "+sum1);
        System.out.println("The sum of array a+b is : "+sum2);
        System.out.println(a.length);
        System.out.println(b.length);

    }
}
