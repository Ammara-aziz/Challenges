package Arrays;

import java.util.Scanner;


public  class RandomChallenges {
    public static Scanner sc = new Scanner(System.in);

     public static int[] inputArray(int[] numArray){

        int sum = 0;

        int i= 0;
        while (i<numArray.length){
            System.out.println("Enter Number at "+ i +" index");
            numArray[i] = sc.nextInt();
            sum += numArray[i];

            i++;
        }
        System.out.println("Sum of Numbers are "+ sum);

        int average = sum/numArray.length;

        System.out.println("Average of Numbers are "+ average);

        return numArray;
    }
    //isSorted
    static boolean isSorted(int[] numA){

        for (int i = 0; i < numA.length - 1; i++) {
            if(numA[i]> numA[i+1]){

                return false;
            }

        }
        return true;
    }
    //checkOccurnences
    public static void occurences(int[] numArray){

        boolean found = false;

        System.out.println("Enter Number you want to search");
        int target = sc.nextInt();

        for (int i = 0; i < numArray.length; i++) {

            // searching
            if(numArray[i] == target){
                System.out.println(target + " found at index " + i);
                found = true;
                break;
            }

        }
        if(!found){

            System.out.println("Such Number Doesn't Exists");

        }
    }
    static void RepeatingAlphabetsSummary (){
        String[] strArr = new String[4];
        strArr = new String[]{"apple", "Fordo", "mango ", "accountant "};
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);;
        }
        int[][] arr = {
                {9},
                {23}
        };
    }

    static void reverseArray(){

    }


}



