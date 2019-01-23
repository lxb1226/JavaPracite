package Java开发实战经典.chapter10;

class Notepad<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
public class GenericsDemo09 {
    public static void main(String[] args) {
        Notepad<String,Integer> t = null;
        t = new Notepad<String,Integer>();
        t.setKey("李兴华");
        t.setValue(30);

        System.out.println("姓名：" + t.getKey() + ", 年龄: " +t.getValue());
    }
}
