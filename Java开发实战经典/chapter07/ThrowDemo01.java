package Java开发实战经典.chapter07;

public class ThrowDemo01 {
    public static void main(String[] args) {
        try{
            throw new Exception("自己抛出的异常！");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
