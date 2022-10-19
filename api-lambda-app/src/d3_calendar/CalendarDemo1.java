package d3_calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        // 1.拿到系统此刻日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        // 2.获取日历信息 get
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int days = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        // 3.修改日历的某个字段信息
//        cal.set(Calendar.HOUR, 12);
//        System.out.println(cal);

        // 64天之后 是什么时间
        cal.add(Calendar.DAY_OF_YEAR, 64);
        cal.add(Calendar.MINUTE, 59);

        // 拿到此刻日期对象
        Date d = cal.getTime();
        System.out.println(d);
    }
}
