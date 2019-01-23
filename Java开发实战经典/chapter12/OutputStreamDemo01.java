package Java开发实战经典.chapter12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        // 1.第1步： 使用File类找到一个文件
        // 声明File对象
        File f = new File("d:" + File.separator + "test.txt");
        // 第2步： 通过子类实例化父类对象
        OutputStream out = null;
        // true表示追加内容
        out = new FileOutputStream(f,true);
        String str = "Hello World!!!";
        byte b[] = str.getBytes();
        // 将内容写入文件
        out.write(b);
        // 关闭输出流
        out.close();

    }
}
