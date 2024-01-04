package Queue;

public class Array_Implementation {
    public static class queue{
        int f=-1;
        int r=-1;
        int size=0;
        int[]arr=new int[100];
        void add(int val){
            if (r==arr.length-1){
                System.out.println("queue is full!");
                return;
            }
            if (f==-1){
                f=r=0;
                arr[0]=val;
            }
            else {
                arr[++r] = val;

            }
            size++;
        }
        int remove(){
            if (size==0){
                System.out.println("queue is empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        int peek(){
            if (size==0){
                System.out.println("queue is empty!");
                return -1;
            }
            return arr[f];
        }
        void display(){
            if (size==0){
                System.out.println("queue is empty!");
            }
            else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
     queue q=new queue();
     q.add(2);
     q.add(3);
     q.add(6);
     q.remove();
     q.add(12);
        System.out.println(q.peek());
     q.display();
        System.out.println(q.size);
    }
}
