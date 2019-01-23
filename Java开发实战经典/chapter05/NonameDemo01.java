package Java开发实战经典.chapter05;


class Person03{
    private String name;
    private int age;

    public Person03(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public void tell(){
        System.out.println("姓名：" + this.getName() + ",年龄: " + this.getAge());
    }

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
public class NonameDemo01 {
    public static void main(String[] args){
        // 匿名对象，直接在堆内存创建，在栈内存中没有指针，此对象使用一次后就等待被垃圾收集机制回收
        new Person03("张三",30).tell();
    }
}
