package Java开发实战经典.chapter09;

class MyThread02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "运行, i = " + i);

        }
    }
}
public class ThreadNameDemo {
    public static void main(String[] args) {
        MyThread02 my = new MyThread02();
        new Thread(my).start();
        new Thread(my,"线程-A").start();
        new Thread(my,"线程-B").start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
