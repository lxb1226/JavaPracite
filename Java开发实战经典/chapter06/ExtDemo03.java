package Java开发实战经典.chapter06;

class Person01{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student01 extends Person01{
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

public class ExtDemo03 {
    public static void main(String args[]){
        Student01 stu = new Student01();
        stu.setName("张三");
        stu.setAge(30);
        stu.setSchool("清华大学");
        System.out.println("姓名： " + stu.getName() + "，年龄：" + stu.getAge() + "，学校：" + stu.getSchool());
    }
}
