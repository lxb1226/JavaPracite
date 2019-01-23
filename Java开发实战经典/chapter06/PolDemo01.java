package Java开发实战经典.chapter06;

class A2{
    public void fun1(){
        System.out.println("A --> public void fun1() {}");
    }

    public void fun2(){
        this.fun1();
    }
}

class B2 extends A2{
    public void fun1(){
        System.out.println("B --> public void fun1(){}");
    }
    public void fun3(){
        System.out.println("B --> public void fun3(){}");
    }
}

public class PolDemo01 {
    public static void main(String args[]){
//        注意： 在进行对象的向下转型之前，必须首先发生对象向上转型。否则将出现对象转换异常

//        定义了子类实例化对象
//        B2 b = new B2();
//        发生了向上转型的关系，子类 --> 父类
//        如果对象发生了向上转型之后，所调用的方法一定是被子类覆写过的方法
//        但是此时对象a无法调用B类的fun3()方法，因为此方法只在子类定义，而没有在父类定义，如果要想调用子类自己的方法，则肯定要使用子类实例
//        A2 a = b;
//        a.fun1();
//        发生向上转型，子类 --> 父类
        A2 a = new B2();
//        此时发生了向下转型
        B2 b = (B2)a;
//        调用方法被覆写的方法
        b.fun1();
//          调用父类的方法
        b.fun2();
//        调用子类自己定义的方法
        b.fun3();

    }
}
