package Java开发实战经典.chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo04 {
    public static void main(String[] args) {
        List<String> allList = null;
        allList = new ArrayList<String>();

        allList.add("Hello");
        allList.add(0,"World");
        allList.add("MLDN");
        allList.add("www.mldn.cn");
        String str[] = allList.toArray(new String[] {});        // 指定的泛型类型
        System.out.println("指定数组类型： ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + "、");
        }
        System.out.println("\n返回对象数组：");
        Object obj[] = allList.toArray();                   // 直接返回对象数组
        for (int i = 0; i < obj.length; i++) {
            String temp = (String) obj[i];                  // 每一个对象都是String类型实例
            System.out.print(temp + "、");

        }
    }
}
