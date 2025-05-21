package D;

import java.util.Scanner;

public class ExamScoreTr {
    public static void main(String[] args){
        final int num_stu=5;
        int[] examscore=new int[num_stu];
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<num_stu;i++){
            System.out.println("enter score");
          examscore[i]=scan.nextInt();
          System.out.println("score of"+i+" "+examscore[i]);
        }
        int sum=0;
        int high=examscore[0];
        for (int score:examscore){
            sum+=score;
            if (score>high){
                high=score;
            }
        }
        System.out.println(high);
        System.out.println(sum);
    }
}
