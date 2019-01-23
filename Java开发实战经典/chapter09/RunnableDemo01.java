package Java开发实战经典.chapter09;

class MyThread01 implements Runnable{
    private String name;
    public MyThread01(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println(name + "运行，i = " + i);

        }
    }
}

public class RunnableDemo01 {
    public static void main(String[] args) {
        MyThread01 my1 = new MyThread01("线程A");     // 实例化Runnable子类对象
        MyThread01 my2 = new MyThread01("线程B");
        Thread t1 = new Thread(my1);        //  实例化Thread对象，
        Thread t2 = new Thread(my2);
        t1.start();                         //  启动线程
        t2.start();

    }


}
