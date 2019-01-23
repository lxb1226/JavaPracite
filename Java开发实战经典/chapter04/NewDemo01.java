package Java开发实战经典.chapter04;

public class NewDemo01 {
    public static void main(String[] args){
        System.out.print("不传递参数(fun())");
        fun();
        System.out.print("\n传递1个参数(fun(1)): ");
        fun(1);
        System.out.print("\n传递5个参数(fun(1,2,3,4,5)): ");
        fun(1,2,3,4,5);

    }
    public static void fun(int... arg){
        for (int i = 0; i < arg.length; i++){
            System.out.print(arg[i] + "、");
        }
    }
}
