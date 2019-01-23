package Java开发实战经典.chapter10;

class Point<T>{
    private T var;
    public T getVar(){
        return var;
    }

    public void setVar(T var){
        this.var = var;
    }
}

public class GenericsDemo05 {
    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>();
        p.setVar(30);
        System.out.println(p.getVar()*2);
    }
}
