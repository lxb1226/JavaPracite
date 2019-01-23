package Java开发实战经典.chapter06;

class Person06{
    private String name;
    private int age;

    public Person06(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "姓名" + this.name + "；年龄：" + this.age;
    }
}
public class ObjectDemo02 {
    public static void main(String args[]){
        Person06 per = new Person06("李兴华",30);
        System.out.println("对象信息：" + per);
    }
}
