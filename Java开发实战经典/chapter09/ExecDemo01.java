package Java开发实战经典.chapter09;

class MyThread06 extends Thread{
    private int time;

    public MyThread06(String name, int time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(this.time);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "线程,休眠" + this.time + "s。");
    }
}
public class ExecDemo01 {
    public static void main(String[] args) {
        MyThread06 mt1 = new MyThread06("线程A",10000);
        MyThread06 mt2 = new MyThread06("线程B",20000);
        MyThread06 mt3 = new MyThread06("线程C",30000);
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
