package Two_D_Array;

public class Rotate_90_deg {
    public static void main(String[] args) {
        int[][]arr={{1,2,3,4},{5,6,7,8},{9,7,6,5}};
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0;i<3;i++){
            for (int j=i;j<4;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i=0;i<arr.length;i++){
            int li=0;
            int ri=arr.length-1;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;
            }
        }

//        for (int i=0;i<3;i++){
//            for (int j=0;j<4;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
