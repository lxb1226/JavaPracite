package Java开发实战经典.chapter05;

class Person{
    private String name;
    private int age;
    public void tell(){
        System.out.println("姓名：" + this.getName() + ",年龄: " + this.getAge());
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }
}

public class EncDemo02 {
    public static void main(String[] args){
        Person per = new Person();
        per.setName("张三");
        per.setAge(30);
        per.tell();
    }

}
