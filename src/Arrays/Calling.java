package Arrays;

import java.util.Scanner;

public class Calling {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter no of elements");
        int size = sc.nextInt();

        //System.out.println("Enter Number: ");
        int[] numArray = new int[size];

        int[] summAverage = RandomChallenges.inputArray(numArray);
        for(int num : summAverage){
            System.out.println(num);
        }

        RandomChallenges.occurences(numArray);

        RandomChallenges.RepeatingAlphabetsSummary();
    }
}
