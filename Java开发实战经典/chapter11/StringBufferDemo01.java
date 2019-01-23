package Java开发实战经典.chapter11;


public class StringBufferDemo01 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();      // 声明StringBuffer对象
        buf.append("Hello ");       // 向StringBuffer对象添加内容

        buf.append("World").append("!!!");      // 可以连续调用append方法
        buf.append("\n");                       // 添加一个转义字符用来换行
        buf.append("数字 = ").append(1).append("\n");     // 可以添加数字
        buf.append("字符 = ").append('C').append("\n");   // 可以添加字符
        buf.append("布尔 = ").append(true);            // 可以添加布尔类型
        fun(buf);
        System.out.println(buf);
    }

    public static void fun(StringBuffer s){
        s.append("MLDN ").append("LiXingHua");
    }
}
