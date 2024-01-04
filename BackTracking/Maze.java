package BackTracking;

public class Maze {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        int count=mazepath(1,1,row,col);
        System.out.println(count);

    }
    private static int mazepath(int sr, int sc, int er, int ec) {
        if (sr>er || sc>ec)return 0;
        if (sr==er && sc==ec)return 1;
        int downWays=mazepath(sr+1,sc,er,ec);
        int rightWays=mazepath(sc,sr+1,er,ec);
        int totalWaya=downWays+rightWays;
        return totalWaya;
    }
}
