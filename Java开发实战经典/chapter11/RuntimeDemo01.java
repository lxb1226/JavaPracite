package Java开发实战经典.chapter11;

public class RuntimeDemo01 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("JVM最大内存量：" + run.maxMemory());
        System.out.println("JVM空闲内存量: " + run.freeMemory());
        String str = "Hello" + "World" + "!!!" + "\t" + "Welcome" + "To" + "MLDN" + "~";
        System.out.println(str);
        for (int x = 0; x < 1000; x++) {
            str += x;
        }

        System.out.println("操作String之后的，JVM空闲内存量：" + run.freeMemory());
        run.gc();
        System.out.println("垃圾回收之后的，JVM空闲内存量： " + run.freeMemory());
    }
}
