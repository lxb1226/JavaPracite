package Java开发实战经典.chapter07;

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
public class DefaultException {
    public static void main(String[] args) {
        try{
            throw new MyException("自定义异常");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
