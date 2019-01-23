package Java开发实战经典.chapter13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<String> allList = null;
        Collection<String> allCollection = null;
        allList = new ArrayList<String>();
        allCollection = new ArrayList<String>();

        allList.add("Hello");
        allList.add(0,"Wrold");
        System.out.println(allList);
        allCollection.add("LXH");
        allCollection.add("www.mldn.cn");
        allList.addAll(allCollection);
        allList.addAll(0,allCollection);
        System.out.println(allList);
    }
}
