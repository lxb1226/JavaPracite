package Java开发实战经典.chapter05;


class Person02{
    private String name;
    private int age;
    public Person02(){

    }
    public Person02(String name){
        this.setName(name);
    }
    public Person02(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tell(){
        System.out.println("姓名：" + this.getName() + ",年龄: " + this.getAge());
    }
}
public class ConsDemo02 {
    public static void main(String[] args){
        Person02 per = new Person02("张三");
        per.tell();

    }
}
