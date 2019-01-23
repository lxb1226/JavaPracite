package Java开发实战经典.chapter04;

public class ArrayDemo02 {
    public static void main(String[] args){
        int score[] = new int[3];
        for (int x = 0; x < 3; x++){
            score[x] = x * 2 + 1;
        }
        for (int x = 0; x < 3; x++){
            System.out.println("score[" + x + "] = " + score[x] );
        }
     }
}
