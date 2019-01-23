package Java开发实战经典.chapter06;

abstract class A3{
    public abstract void print();
}
class B3 extends A3{
    public void print(){
        System.out.println("Hello World");
    }
}

public class AbstractCaseDemo01 {
    public static void main(String args[]){
        A3 a = new B3();
        a.print();
    }
}
