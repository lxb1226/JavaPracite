package Java开发实战经典.chapter05;

class Person06{
    String name;
    int age;
    public void tell() {
        System.out.println("姓名：" + name + ",年龄: " + age);
        }
        }

public class ClassDemo03 {
    public static void main(String[] args){
//        Person06 per = null;
//        per = new Person06();
        Person06 per = new Person06();
        per.name = "张三";
        per.age = 10;

        per.tell();

    }
}
