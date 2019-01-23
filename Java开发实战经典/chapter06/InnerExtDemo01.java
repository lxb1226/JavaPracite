package Java开发实战经典.chapter06;

abstract  class A6{
    public abstract void printA();
    interface B6{
        public void printB();
    }
}

class X1 extends A6{
    public void printA(){
        System.out.println("HELLO--> A");
    }
    class Y1 implements B6{
        public void printB(){
            System.out.println("HELLO --> B");
        }
    }

}



public class InnerExtDemo01 {
    public static void main(String args[]){
        A6.B6 b  = new X1().new Y1();
        b.printB();

    }
}
