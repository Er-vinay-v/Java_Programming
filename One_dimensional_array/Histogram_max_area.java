package One_dimensional_array;

public class Histogram_max_area {
    static void display(int[]arr,int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={4,2,1,5,6,3,2,4,2,0};
        int n=arr.length-1;
        int[]next_sm=new int[n];
       int k=n-1;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[i]){
                    next_sm[i]=j;
                    break;
                }
                else if(arr[j]>arr[i]) next_sm[i]=n;
            }
        }
        next_sm[n-1]=n;

        int[]priv_min=new int[n];
        for (int i=n-1;i>=0;i--){
            for (int j=i-1;j>=0;j--){
                if (arr[j]<arr[i]){
                    priv_min[i]=j;
                    break;
                }
                else priv_min[i]=-1;
            }
        }
        priv_min[0]=-1;

        int[]width=new int[n];
        for (int i=0;i<n;i++){
            width[i]=(next_sm[i]-priv_min[i]-1);
        }

        int[]area=new int[n];

        for (int i=0;i<n;i++){
            area[i]=arr[i]*width[i];
        }

      int ans=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
           if (area[i]>ans)ans=area[i];
        }

        display(width,n);
        display(area,n);
        display(priv_min,n);
        display(next_sm,n);
        System.out.println("maximum area of histogram is "+ans);

    }

}
