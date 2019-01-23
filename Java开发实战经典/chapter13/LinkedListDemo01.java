package Java开发实战经典.chapter13;

import java.util.LinkedList;

public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.add("B");
        link.add("C");
//        System.out.println("初始化链表：" + link);
//        link.addFirst("X");
//        link.addLast("Y");
//        System.out.println("增加头和尾之后的链表：" + link);
        System.out.println("1-1、element()方法找到表头：" + link.element());
        System.out.println("1-2、 找完之后的链表内容: " + link);
        System.out.println("2-1、peek()方法找到表头：" + link.peek());
        System.out.println("2-2、 找完之后的链表内容: " + link);
        System.out.println("3-1、 poll方法找到表头：" + link.poll());
        System.out.println("3-2、 找完之后的链表内容: " + link);


    }
}
