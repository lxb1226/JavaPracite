package Java开发实战经典.chapter13;

import java.util.HashSet;
import java.util.Set;

class Person01{
    private String name;
    private int age;

    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Person01)){
            return false;
        }
        Person01 p = (Person01) obj;
        if(this.name.equals(p.name) && this.age == p.age){
            return true;
        }else{
            return false;
        }
    }

    public int hashCode(){
        return this.name.hashCode() * this.age;
    }

    @Override
    public String toString() {
        return "姓名： " + this.name + ": 年龄" + this.age;
    }
}
public class RepeatDemo02 {
    public static void main(String[] args) {
        Set<Person01> allSet = new HashSet<Person01>();
        allSet.add(new Person01("张三",30));
        allSet.add(new Person01("李四",31));
        allSet.add(new Person01("王五",32));
        allSet.add(new Person01("王五",32));
        allSet.add(new Person01("王五",32));
        allSet.add(new Person01("赵六",33));
        allSet.add(new Person01("孙七",33));
        System.out.println(allSet);
    }
}
