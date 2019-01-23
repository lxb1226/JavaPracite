package Java开发实战经典.chapter12;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) {
//        File f = new File("d:\\test.txt");
//        try{
//            f.createNewFile();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//        System.out.println("pathSeparator: " + File.pathSeparator);
//        System.out.println("separator: " + File.separator);

//        String path = "d:" + File.separator + "test01.txt";
//        File f = new File(path);
//        try{
//            f.createNewFile();
//        }catch(IOException e){
//            e.printStackTrace();
//        }

//        String path = "d:" + File.separator + "test.txt";
//        File f = new File(path);
//        if (f.exists()){
//            f.delete();
//            System.out.println("成功删除");
//        }else{
//            System.out.println("文件不存在");
//        }
//        String path = "d:" + File.separator + "test.txt";
//        File f = new File(path);
//        if(f.exists()){
//            f.delete();
//        }else{
//            try{
//                f.createNewFile();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }

//        File f = new File("d:" + File.separator + "mldn");
//        f.mkdir();

        File f = new File("d:" + File.separator);
//        String str[] = f.list();
//        File files[] = f.listFiles();
//        for (int i = 0; i < files.length; i++) {
//            System.out.println(files[i]);

        if (f.isDirectory()){
            System.out.println(f.getPath() + "路径是目录.");
        }else{
            System.out.println(f.getPath() + "路径不是目录");
        }
    }
}
