
import java.util.Scanner;

/**
 *
 * @author evren
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] ar = new int[30];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int tmp = input.nextInt();
        int i = 0;
        while (tmp > 0) {
            ar[i] = tmp;

            System.out.println("Enter a number: ");
            tmp = input.nextInt();
            i++;
        }
        //display only filled cells of the array
        System.out.println("Display only filled cell values");
        for (int j = 0; j < i; j++) {
            System.out.println((j + 1) + " . " + ar[j]);
        }
        System.out.println("Display whole array cell values");
        for (int j = 0; j < ar.length; j++) {
            System.out.println((j + 1) + " . " + ar[j]);
        }
        
        double sum = 0.0;
        for (int j = 0; j < i; j++) {
            sum = sum + ar[j];
        }
        
        System.out.println("Sum " + sum);
       
        for (int value : ar) {
            System.out.println(value);
        }

    }
}

    /* for each loops: do this to everything in this set, no explicit
         * counter.
         * Syntax: 
         * for(typeitem: set)
         *  //do something to item 
         * */