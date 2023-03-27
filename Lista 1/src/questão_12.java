import java.util.Scanner;

public class questão_12 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        try (Scanner ler = new Scanner(System.in)) {

            System.out.print("\nInsira o valor de A: ");
            int A = ler.nextInt();
            
            System.out.print("\nInsira o valor de B: ");
            int B = ler.nextInt();

            if (A > 10 || A + B == 20) {

                if (A > 10) {

                    System.out.println("\nA > 10");
                }

                if (A + B == 20) {

                    System.out.println("\nA + B == 20");
                }

            } else {

                System.out.println("\nnúmeros não válidos");
            }

            System.out.println("/nSejam bem-vindos à diciplina de Técnicas de Programação");
        }
    }
}