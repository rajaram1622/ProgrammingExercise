import java.util.Scanner;

public class LengthOfOrderedSequence {
    public static void main(String[] args) {
        int finalCount = 0;
        int interimCount = 0;
        Scanner input = new Scanner(System.in);

        /**
         * Get the Input Array from console
         */
        System.out.println("Enter the length of the array:");
        int length=input.nextInt();
        int[] originalArray = new int[length];

        System.out.println("Enter the array digits:");

        for(int i=0; i<originalArray.length;i++) {
            originalArray[i]=input.nextInt();
        }

        /**
         * Find the longest sequence from the input
         */

        for (int i = 0; i < originalArray.length; i++) {
            if (i > 0 && originalArray[i] <= originalArray[i - 1])
                interimCount = 0;
            interimCount++;
            finalCount = Math.max(finalCount, interimCount);
        }
        System.out.println("Length of the longest sub-sequence is:"+finalCount);
    }
}



































