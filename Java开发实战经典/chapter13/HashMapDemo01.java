package Java开发实战经典.chapter13;

import java.util.*;

public class HashMapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = null;
        map = new HashMap<String,String>();
        map.put("mldn","www.mldn.cn");
        map.put("zhinangtan","www.zhinanguan.net.cn");
        map.put("mldnjava","www.mldnjava.cn");
//        String val = map.get("mldn");
//        System.out.println("取出的内容是：" + val);
//        if (map.containsKey("mldn")){
//            System.out.println("搜索的key存在！");
//        }else{
//            System.out.println("搜索的key不存在！");
//        }
//        if (map.containsValue("www.mldn.cn")){
//            System.out.println("搜索的value存在！");
//        }else{
//            System.out.println("搜索的value不存在！");
//        }

//        Set<String> keys = map.keySet();
//        Iterator<String> iter = keys.iterator();
//        System.out.println("全部的keys:");
//        while(iter.hasNext()){
//            String str = iter.next();
//            System.out.print(str + "、");
//        }

        Collection<String> values = map.values();
        Iterator<String> iter = values.iterator();
        System.out.println("全部的value:");
        while(iter.hasNext()){
            String str = iter.next();
            System.out.print(str + "、");
        }

    }
}
