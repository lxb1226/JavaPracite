package Java开发实战经典.chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        List<String> allList = null;
        allList = new ArrayList<String>();

        allList.add("Hello");
        allList.add(0,"World");
        allList.add("MLDN");
        allList.add("www.mldn.cn");
//        allList.remove(0);
//        allList.remove("Hello");
        System.out.println("由前向后输出：");
        for (int i = 0; i < allList.size(); i++) {
            System.out.print(allList.get(i) + "、");

        }
        System.out.println("\n 由后向前输出：");
        for (int i = allList.size() -1; i >= 0; i--) {
            System.out.print(allList.get(i) + "、");

        }
//        System.out.println(allList);
    }
}
