package Java开发实战经典.chapter05;

class Singleton{
    private static Singleton instance = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("Hello world!");
    }

}
public class SingleDemo05 {
    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        s1.print();
        s2.print();
        s3.print();
    }
}
