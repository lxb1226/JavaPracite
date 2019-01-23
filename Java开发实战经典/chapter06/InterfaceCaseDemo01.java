package Java开发实战经典.chapter06;

interface A4{
    public abstract void print();
}

class B4 implements A4{
    public void print(){
        System.out.println("Hello,World");
    }
}

public class InterfaceCaseDemo01 {
    public static void main(String args[]){
        A4 a = new B4();
        a.print();
    }
}
