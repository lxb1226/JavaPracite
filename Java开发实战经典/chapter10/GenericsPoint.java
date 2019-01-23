package Java开发实战经典.chapter10;

class Point01 <T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
public class GenericsPoint {

    public static void main(String[] args) {
        Point01<Integer> p = new Point01<Integer>();
        p.setX(10);
        p.setY(10);
        int x = p.getX();
        int y = p.getY();
        System.out.println("整数表示,x坐标: " + x);
        System.out.println("整数表示,y坐标：" + y);
    }
}
