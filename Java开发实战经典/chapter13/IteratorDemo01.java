package Java开发实战经典.chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo01 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        all.add("hello");
        all.add("_");
        all.add("world");
        Iterator<String> iter = all.iterator();         // 直接实例化Iterator
        while(iter.hasNext()){
            System.out.print(iter.next() + "、");
        }
    }
}
