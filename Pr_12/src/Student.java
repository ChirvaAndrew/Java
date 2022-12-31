import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private int[] idNumber;
    private int score;

    public Student() {
        idNumber = new int[0];
        score = 0;
    }

    public void setScore(int value){
        score = value;
    }
    public int getScore(){
        return score;
    }

    public void fill(){
        for (int i =0; i < idNumber.length; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
            idNumber[i] = randomNum;
        }
    }

    public void sort(int size){
        idNumber = new int[size];
        fill();
        System.out.println("До сортировки вставками: ");
        System.out.println(Arrays.toString(idNumber));
        insertionSort();
        System.out.println("После сортировки вставками: ");
        System.out.println(Arrays.toString(idNumber));
    }

    public void insertionSort(){
        for (int left = 0; left < idNumber.length; left++) {
            int value = idNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < idNumber[i]) {
                    idNumber[i + 1] = idNumber[i];
                } else {
                    break;
                }
            }
            idNumber[i + 1] = value;
        }
    }
}