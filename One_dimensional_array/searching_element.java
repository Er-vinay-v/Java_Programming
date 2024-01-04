package One_dimensional_array;

public class searching_element {
    public static void main(String[] args) {
        int []w={2,4,5,6,7,45,7,45,46};
        int x=46;
        //int x=40;

        for (int i=0;i<w.length;i++){
            if (x==w[i]){
                System.out.println(i);
                break;
            }
            else System.out.println("NOt present the target element in this array.");
            break;
        }
    }
}
