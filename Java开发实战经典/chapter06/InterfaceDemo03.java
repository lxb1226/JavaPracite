package Java开发实战经典.chapter06;

interface A1{
    public static final String AUTHOR = "Liixnghua";
    public void print();
    public String getInfo();
}

interface B1{
    public void say();
}

class X implements A1,B1{
    public void say(){
        System.out.println("Hello World!");
    }

    public String getInfo(){
        return "hello";
    }

    public void print(){
        System.out.println("作者：" + AUTHOR);
    }
}

public class InterfaceDemo03 {
    public static void main(String args[]){
        X x = new X();
        x.say();
        x.print();
    }
}
