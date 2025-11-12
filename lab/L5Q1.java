package lab;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args){
        Random r = new Random ();
        Scanner s = new Scanner (System.in);
        
        System.out.print("Please enter the number of students: ");
        int N = s.nextInt();
        int[] list_of_score = new int[N];

        for (int i = 0; i < N; i++) {
            list_of_score[i] = r.nextInt(101); 
        }

        for (int scores : list_of_score){
            System.out.println(scores);
        }

        int highest = list_of_score[0];
            for (int i = 1; i < N; i++) {
                if (list_of_score[i] > highest) {
                    highest = list_of_score[i];
                }
            }
            System.out.println("The highest score is: " + highest);

        int lowest = list_of_score[0];
            for (int i = 1; i < N; i++) {
                if (list_of_score[i] < lowest) {
                    lowest = list_of_score[i];
                }
            }
            System.out.println("The lowest score is: " + lowest);

        double average = 0;
            for (int i = 0; i < N; i++) {
                average += list_of_score[i];
            }
            average = average / N;
            System.out.println("The average score is: " + average);

        s.close();
    }
}