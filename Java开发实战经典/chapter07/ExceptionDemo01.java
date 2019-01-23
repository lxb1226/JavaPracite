package Java开发实战经典.chapter07;

public class ExceptionDemo01 {
    public static void main(String args[]){
        System.out.println("************计算开始*************");
        int i = 10;
        int j = 0;
        int temp = i / j;
        System.out.println("两个数字相除结果：" + temp);
        System.out.println("************计算结束*************");
    }
}
