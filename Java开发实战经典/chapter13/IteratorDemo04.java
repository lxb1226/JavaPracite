package Java开发实战经典.chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorDemo04 {
    public static void main(String[] args) {
        // 声明Map对象，指定泛型类型
        Map<String,String> map = null;
        // 实例化对象
        map = new HashMap<String,String>();
        // 增加内容
        map.put("mldn","www.mldn.cn");
        map.put("zhinangtan","www.zhinanguan.net.cn");
        map.put("mldnjava","www.mldnjava.cn");

        // 声明一个Set集合， 指定泛型
        Set<Map.Entry<String,String>> allSet = null;
        // 将Map接口实例化
        allSet = map.entrySet();
        // 声明Iteartor对象
        Iterator<Map.Entry<String,String>> iter = null;
        // 实例化Iterator对象
        iter = allSet.iterator();

        while(iter.hasNext()){
            // 找到Map.Entry对象
            Map.Entry<String,String> me = iter.next();
            System.out.println(me.getKey() + "-->" + me.getValue());
        }

    }
}
