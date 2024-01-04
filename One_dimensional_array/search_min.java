package One_dimensional_array;

public class search_min {
    public static void main(String[] args) {
        int []s={5,6,4,1,8,6,4};
        int min=s[0];
        for (int i=0;i<s.length;i++){
            if (s[i]<min){
                min=s[i];
            }
        }
        System.out.println(min);

    }
}
