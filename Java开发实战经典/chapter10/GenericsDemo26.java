package Java开发实战经典.chapter10;

class Demo{
    public <T> T fun(T t){
        return t;
    }
}
public class GenericsDemo26 {
    public static void main(String[] args) {
        Demo d = new Demo();
        String str = d.fun("李兴华");
        int i = d.fun(30);
        System.out.println(str);
        System.out.println(i);
    }
}
