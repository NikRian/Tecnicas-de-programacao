import java.util.Scanner;

public class item2 {

    public static Float vectorAvarage(float[] vector1, float[] vector2) {

        float avarage = 0;
        float sumSize = vector1.length + vector2.length;

        for (int aux = 0; aux < vector1.length; aux++) {
            avarage += vector1[aux];
        }

        for (int aux = 0; aux < vector2.length; aux++) {
            avarage += vector2[aux];
        }
        avarage /= sumSize;
        
        return avarage;
    }

    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {

            int size1 = input.nextInt();
            float[] vetor1 = new float[size1];

            int size2 = input.nextInt();
            float []vetor2 = new float[size2];

            for (int aux = 0; aux < size1; aux++) {
                vetor1[aux] = input.nextFloat();
            }

            for (int aux = 0; aux < size2; aux++) {
                vetor2[aux] = input.nextFloat();
            }

            System.out.println(vectorAvarage(vetor1,vetor2));

        }
    }
}