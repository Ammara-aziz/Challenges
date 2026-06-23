package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] numArray = new int[size];

        RandomChallenges.inputArray(numArray);

        System.out.println("\nArray Elements:");
        for (int num : numArray) {
            System.out.print(num + " ");
        }

        // Find Maximum and Minimum
        int max = numArray[0];
        int min = numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }

            if (numArray[i] < min) {
                min = numArray[i];
            }
        }

        System.out.println("\n\nMaximum = " + max);
        System.out.println("Minimum = " + min);

        // Delete Integer Element
        System.out.print("\nEnter Number you want to delete: ");
        int target = sc.nextInt();

        int[] deleted = deleteElement(numArray, target);

        System.out.println("Array after deletion:");
        for (int n : deleted) {
            System.out.print(n + " ");
        }

        // String Array Example
        String[] originalArray = {"Java", "Python", "C++", "Java", "JavaScript"};

        System.out.println("\n\nOriginal String Array:");
        System.out.println(Arrays.toString(originalArray));

        System.out.print("Enter String value to delete: ");

        sc.nextLine(); // Consume leftover newline
        String elementToDelete = sc.nextLine();

        String[] modifiedArray = removeElement(originalArray,elementToDelete);
        System.out.println("Array after deletion:");
        System.out.println(Arrays.toString(modifiedArray));
    }


    // Delete Integer Element
    static int[] deleteElement(int[] numArray, int target) {

        int index = -1 ;

        // Search for target
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == target) {
                index = i;
                break;
            }
        }

        // Element not found
        if (index == -1) {
            System.out.println("Element Not Found");
            return numArray;
        }

        int[] newArray = new int[numArray.length - 1];

        int j = 0;

        for (int i = 0; i < numArray.length; i++) {

            if (i != index) {
                newArray[j] = numArray[i];
                j++;
            }
        }

        return newArray;
    }

    // Delete All Occurrences of String

    static String[]  removeElement (String[] arr,String target){
        int occ=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(target)){
                System.out.println(target + " found at index " + i);
                occ++;
            }
        }
        if (occ==0){
            System.out.println("Element not Found");
        }
        int nSize = arr.length-occ;
        String[] nArra = new String[nSize];

        int j =0;

        for (int i = 0; i < nArra.length; i++) {
            if(!arr[i].equals(target)){
                nArra[j] = arr[i];
                j++;
            }
        }
        // or in this way also
        /*int i = 0;
        int j = 0;

        while (i < inputArray.length) {

            if (!inputArray[i].equalsIgnoreCase(eleToDelete)) {
                newArray[j] = inputArray[i];
                j++;
            }

            i++;
        }*/
        return nArra;
    }
}