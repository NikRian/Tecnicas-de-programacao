import java.util.Scanner;

public class item13 {

    public static int[] mergeVector(int[] vector1,int[] vector2) {

        int size = vector1.length + vector2.length;

        int[] merged = new int[size];

        for (int aux = 0; aux < vector1.length; aux++) {
            merged[aux] = vector1[aux];
        }

        for (int aux = 0; aux < vector2.length; aux++) {
            merged[(aux + vector1.length)] = vector2[aux];
        }

        return merged;
    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size1 = input.nextInt(),
                size2 = input.nextInt();

            int[] vector1 = new int[size1],
                vector2 = new int[size2];

            for(int aux = 0; aux < size1; aux++) {
                vector1[aux] = input.nextInt();
            }

            for(int aux = 0; aux < size2; aux++) {
                vector2[aux] = input.nextInt();
            }

            int[] mergedVector = mergeVector(vector1,vector2);

            for(int aux = 0; aux < mergedVector.length; aux++) {
                System.out.println(mergedVector[aux]);
            }

        }
    }

}