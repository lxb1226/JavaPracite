package Java开发实战经典.chapter10;

interface Info<T>{
    public T getVar();
}

class InfoImpl<T> implements Info<T>{
    private T var;
    public InfoImpl(T var){
        this.setVar(var);
    }

    @Override
    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}

public class GenericsDemo24 {
    public static void main(String[] args) {
        Info<String> i = null;
        i = new InfoImpl<String>("李兴华");
        System.out.println("内容: " + i.getVar());
    }
}
