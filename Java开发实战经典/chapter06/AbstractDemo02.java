package Java开发实战经典.chapter06;

abstract class A{
    public static final String FLAG = "LiXingHua";
    private String name = "李兴华";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();
}

class B extends A{
    public void print(){
        System.out.println("FLAG = " + FLAG);
        System.out.println("姓名 = " + super.getName());
    }
}

public class AbstractDemo02 {
    public static void main(String args[]){
        B b = new B();
        b.print();
    }
}
