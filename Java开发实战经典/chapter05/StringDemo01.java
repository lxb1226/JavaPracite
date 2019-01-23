package Java开发实战经典.chapter05;

public class StringDemo01 {
    public static void main(String[] args){
        // String类可以采用直接赋值的方式进行操作
        // 也可以调用String类的构造方法
//        String name = "LiXingHua";
        String name = new String("LiXingHua");
        System.out.println("姓名：" + name);
    }
}
