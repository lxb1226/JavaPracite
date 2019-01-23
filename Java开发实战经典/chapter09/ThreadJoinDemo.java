package Java开发实战经典.chapter09;

class MyThread04 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "运行 --> " + i);


        }
    }
}
public class ThreadJoinDemo {
    public static void main(String[] args) {
        MyThread04 mt = new MyThread04();
        Thread t = new Thread(mt,"线程");
        t.start();
        for (int i = 0; i < 50; i++) {
            if (i > 10){
                try{
//                   join() 强制启动一个线程
                    t.join();
                }catch(Exception e){}
            }
            System.out.println("Main线程运行 --> " + i);
        }
    }
}
