package Java开发实战经典.chapter05;

class Person04{
    private String name;
    public Person04(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
public class ObjectArrayDemo01 {
    public static void main(String args[]){
        Person04 per[] = new Person04[3];
        System.out.println("==============数组声明==============");
        for (int i = 0; i < per.length ; i++) {
            System.out.print(per[i] + "、");
        }
        per[0] = new Person04("张三");
        per[1] = new Person04("李四");
        per[2] = new Person04("王五");

        System.out.println("\n=============对象实例化===============");
        for (int i = 0; i < per.length ; i++) {
            System.out.print(per[i].getName() + "、");

        }


    }
}
