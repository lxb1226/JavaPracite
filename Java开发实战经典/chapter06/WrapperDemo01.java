package Java开发实战经典.chapter06;

public class WrapperDemo01 {
    public static void main(String args[]){
//        int x = 30;     // 声明一个基本数据类型
//        Integer i = new Integer(x);     // 装箱： 将基本数据类型变为包装类
//        int temp = i.intValue();        // 拆箱： 将包装类变为基本数据类型

//        float f = 30.3f;        // 声明一个浮点类型
//        Float x = new Float(f); // 装箱： 将基本数据类型变为包装类
//        float y = x.floatValue();   // 拆箱： 将包装类变为基本数据类型
        Integer i = 30;     // 自动装箱
        Float f = 30.3f;
        int  x = i;     // 自动拆箱
        float y = f;


    }
}
