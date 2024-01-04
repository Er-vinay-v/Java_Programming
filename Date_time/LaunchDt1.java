package Date_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LaunchDt1 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        int day=date.getDayOfMonth();
        System.out.println(day);
        int s=date.hashCode();
        System.out.println(s);

        LocalTime time=LocalTime.now();
        System.out.println(time);
       int hour= time.getHour();
       int minut=time.getMinute();
       int sec=time.getSecond();
       int nano=time.getNano();
        System.out.println(hour+":"+minut+":"+sec+":"+nano);

    }
}
