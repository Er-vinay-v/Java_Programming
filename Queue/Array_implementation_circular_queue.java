package Queue;

public class Array_implementation_circular_queue {
    public static class cqa{
        int[]arr=new int[5];
        int n=arr.length;
        int f=-1;
        int r=-1;
        int size=0;
        void add(int val)throws Exception{
            if (size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0){
                f=r=0;
                arr[0]=val;
            }
            else if(r<n-1){
                arr[++r]=val;
            }
            else if(r==n-1){
                r=0;
                arr[0]=val;
            }
            size++;
        }
        int remove()throws Exception{
            if (size==0){
                throw new Exception("Queue is empty!");
            }
            else{
                int val=arr[f];
                if (f==n-1)f=0;
                else f++;
                size--;
                return val;
            }
        }
        int peek()throws Exception{
            if (size==0){
                throw new Exception("Queue is empty!");
            }
            else return arr[f];
        }
        void display(){
            if (size==0){
                System.out.println("Queue is empty!");
                return;
            }
            else if(f<=r){
                for (int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }else{
                for (int i=f;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws Exception {
        cqa q=new cqa();
        //q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.remove();
        q.remove();
        q.display();
        q.add(0);
        q.add(9);
        q.display();
        System.out.println(q.peek());


    }
}
