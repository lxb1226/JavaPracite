package Java开发实战经典.chapter12;

import java.io.File;

public class FileDemo02 {
    public static void main(String[] args) {
        File my = new File("e:" + File.separator + "span网盘下载文件" + File.separator);
        print(my);
    }

    public static void print(File file){
        if (file != null){
            if (file.isDirectory()){
                File f[] = file.listFiles();
                if (f != null){
                    for (int i = 0; i < f.length; i++) {
                        print(f[i]);
                    }
                }
            }else{
                System.out.println(file);
            }
        }
    }
}
