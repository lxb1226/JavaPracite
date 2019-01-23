package Java开发实战经典.chapter04;

public class ArrayDemo07 {
    public static void main(String[] args){
        int score[] = {67,89,87,69,90,100,75,90};
        for (int i = 1; i < score.length; i++){
            for (int j = 0; j < score.length; j++){
                if (score[i] < score[j]){
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
            System.out.print("第" + i + "次排序的结果：\t" );
            for (int j = 0; j < score.length; j++){
                System.out.print(score[j] + "\t");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t");
        }

    }
}
