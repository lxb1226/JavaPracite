package Java开发实战经典.chapter04;

public class MethodDemo02 {
    public static void main(String[] args){
        int one = addOne(10,20);
        float two = addTwo(10.3f,13.3f);
        System.out.println("addOne的计算结果：" + one);
        System.out.println("addTwo的计算结果：" + two);
    }

    public static int addOne(int x, int y){
        int temp = 0;
        temp = x + y;
        return temp;
    }
    public static float addTwo(float x, float y){
        float temp = 0;
        temp = x + y;
        return temp;
    }


}
