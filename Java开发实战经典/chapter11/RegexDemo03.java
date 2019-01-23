package Java开发实战经典.chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo03 {
    public static void main(String[] args) {
        String str = "1983-07-27";
        String pat = "\\d{4}-\\d{2}-\\d{2}";
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(str);
        if (m.matches()){
            System.out.println("日期格式合法");
        }else{
            System.out.println("日期格式不合法");
        }
    }
}
