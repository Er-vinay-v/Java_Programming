package Stack_question_practice;

public class Next_greater_elements {
    public static void main(String[] args) {
        int[]arr={1,3,2,1,5,8,4,3,5};
        int[]brr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            brr[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[i]){
                    brr[i]=arr[j];
                    break;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
