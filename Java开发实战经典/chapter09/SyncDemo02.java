package Java开发实战经典.chapter09;

class MyThread07 implements Runnable{
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.sale();

        }
    }

    public synchronized void sale(){
        if (ticket > 0){
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                e.printStackTrace();
        }
            System.out.println("买票: ticket = " + ticket--);
    //    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            synchronized (this){
//                if (ticket > 0){
//                    try{
//                        Thread.sleep(300);
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                    System.out.println("买票：ticket = " + ticket--);
//                }
//            }

        }
    }
}
public class SyncDemo02 {
    public static void main(String[] args) {
        MyThread07 mt = new MyThread07();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
    }
}
