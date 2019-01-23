package Java开发实战经典.chapter06;

class Person{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
}

class Student extends Person{

}

public class ExtDemo02 {
    public static void main(String args[]){
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(30);
        System.out.println("姓名： " + stu.getName() + "年龄： " + stu.getAge());
    }

}
