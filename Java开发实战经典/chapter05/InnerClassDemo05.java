package Java开发实战经典.chapter05;


class Outer01{
    private String info = "hello world!";
    public void fun(final int temp){
        class Inner01{
            public void print(){
                System.out.println("类中的属性：" + info);
                System.out.println("方法中的参数：" + temp);
            }
        }
        new Inner01().print();
    }
}
public class InnerClassDemo05 {
    public static void main(String args[]){
        new Outer01().fun(30);
    }
}
