package Java开发实战经典.chapter12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterDemo01 {
    public static void main(String[] args) throws Exception {
        File f = new File("d:" + File.separator + "test.txt");
        Writer out = null;
        out = new OutputStreamWriter(new FileOutputStream(f));
        out.write("hello world");
        out.close();
    }
}
