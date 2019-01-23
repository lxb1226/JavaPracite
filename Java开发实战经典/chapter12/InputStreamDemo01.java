package Java开发实战经典.chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 第1步： 使用File类找到文件
        // 声明File对象
        File f = new File("d:" + File.separator + "test.txt");

        // 第2步： 通过子类实例化父类对象
        InputStream input = null;
        input = new FileInputStream(f);
        // 第3步： 进行读操作
        // 所有的内容都将读到此数组
//        byte b[] = new byte[1024];
//        // 将内容读出
//        int len = input.read(b);
//        // 第4步： 关闭输入流
//        input.close();
//        System.out.println("读入数据的长度: " + len);
//        System.out.println("内容为: " + new String(b,0,len));

        byte b[] = new byte[(int)f.length()];
        input.read(b);
        input.close();
        System.out.println("内容为：" + new String(b));


    }
}
