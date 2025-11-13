package lab;

import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[20];

        System.out.println("A list of 20 random integer within  0-100");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
            System.out.print(arr[i]);
            if (i < 19) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Array in descending order");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < 19) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Enter a number to search: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for(int i=0 ; i<arr.length ; i++){
            if(num==arr[i]){
                System.out.println(num + " found");
                System.out.println("Linear Search - " + i + " loop(s)");
                break;
            } 
        }
        
        int low = 0;
        int high = arr.length-1;
        int middle;
        int loop_count = 0;
        
        while(low <= high){
            middle = (low + high)/2;
            
            if (num == arr[middle]){
                break;
            }
            
            else if (num < arr[middle])
                high = middle - 1;
            else   
                low = middle + 1;
            
            loop_count++;
        }
        System.out.println(num + " found");
        System.out.println("Binary Search - " + loop_count + " loop(s)");
        s.close();
    }
}
