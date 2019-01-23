package Java开发实战经典.chapter12;

import java.io.*;

public class WriterDemo01 {
    public static void main(String[] args) throws Exception {
        File f = new File("d:" + File.separator + "test.txt");
//        Writer out = null;
//        out = new FileWriter(f);
//        String str = "Hello World!!!";
//        out.write(str);
//        out.close();
        Reader reader = null;
        reader = new FileReader(f);
        char c[] = new char[1024];
        int len = reader.read(c);
        System.out.println("内容为：" + new String(c,0,len));

    }
}
