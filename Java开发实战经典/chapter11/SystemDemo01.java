package Java开发实战经典.chapter11;

public class SystemDemo01 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 30000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("计算所花费的时间：" + (endTime - startTime) + "毫秒");
        System.getProperties().list(System.out);
    }
}
