package Java开发实战经典.chapter03;

public class DataDemo01 {
    public static void main(String[] args){
//        int num = 9999999999999999;
        int max = Integer.MAX_VALUE;
        System.out.println("整形的最大值：" + max);
        System.out.println("整形的最大值+1：" + (max+1));
        System.out.println("整形的最大值+2：" + (max+2L));
        System.out.println("整形的最大值+2：" + ((long)max+2));
//        System.out.println(num);

    }
}
