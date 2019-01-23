package Java开发实战经典.chapter11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo05 {
    public static void main(String[] args) {
        String strDate = "2008-10-19 10:11:13.345";
        String pat1 = "yyyy-MM-dd HH:mm:ss.SSS";        // 定义一个模板
        String pat2 = "yyyy年MM月dd日HH时mm分ss秒SSS毫秒";      // 定义第2个模板
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);     // 实例化模板对象
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);     // 实例化模板对象
        Date d = null;
        try{
            d = sdf1.parse(strDate);        // 将给定字符串中的日期提取出来
        }catch(ParseException e){
            e.printStackTrace();
        }
        System.out.println(sdf2.format(d));     // 将日期变为新的格式
    }
}
