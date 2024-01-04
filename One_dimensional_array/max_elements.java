package One_dimensional_array;

public class max_elements {
    public static void main(String[] args) {
        int [] Arr ={23,55,67,34,63,456,322};
        int max=0;
        for (int i=0;i<Arr.length;i++){

            if(max<Arr[i]){
                max =Arr[i];
            }

        }
        System.out.println(max);

    }
}
