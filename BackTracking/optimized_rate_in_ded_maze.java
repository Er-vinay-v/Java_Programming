package BackTracking;

public class optimized_rate_in_ded_maze {
    public static void main(String[] args) {
        int rows=4;
        int cols=6;
        int[][]maze={{1,0,1,0,1,1},{1,1,1,1,0,1},{0,1,1,1,1,0},{1,1,0,0,1,1}};

        print(0,0,rows-1,cols-1,"",maze);
    }
    private static void print(int sr,int sc,int er,int ec,String s,int[][]maze){
        if (sr<0 || sc<0)return;
        if (sr>er || sc>ec)return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if (maze[sr][sc]==-1)return;
        maze[sr][sc]=-1;
        // go right
        print(sr,sc+1,er,ec,s+"R",maze);
        //go down
        print(sr+1,sc,er,ec,s+"D",maze);
        //go left
        print(sr,sc-1,er,ec,s+"L",maze);
        //go up
        print(sr-1,sc,er,ec,s+"U",maze);
        maze[sr][sc]=1;
    }
}
