package Date_time;

//import java.util.Arrays;
//import java.util.List;
import java.util.*;
import java.util.stream.*;

public class LaunchSTR {
    public static void main(String[] args) {
        List<Integer>l= Arrays.asList(2,3,4,5,6,7,89);
        System.out.println(l);
        Stream<Integer>streamData=l.stream();
        streamData.forEach(i-> System.out.print(i+" "));
    }
}
