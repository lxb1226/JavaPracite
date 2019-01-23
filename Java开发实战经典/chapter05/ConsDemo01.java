package Java开发实战经典.chapter05;

class Person1{
    public Person1(){
        System.out.println("一个新的Person1对象产生;");
    }

}

public class ConsDemo01 {
    public static void main(String[] args){
        System.out.println("声明对象： Person1 per = null;");
        Person1 per = null;
        System.out.println("实例化对象：per = new Person1();");
        per = new Person1();
    }

}
