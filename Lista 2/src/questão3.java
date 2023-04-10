import java.util.Random;
import java.util.Scanner;

public class questão3 {

    public static int aleatorio(int max, int min) {

        Random rand = new Random();

        int n_aleatorio = rand.nextInt((max - min) +1) +min;

        return n_aleatorio;
    }

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        
        clear();

        try(Scanner ler = new Scanner(System.in)) {

            int n_usuario;
            int controle;

            System.out.println("Insira o seu palpite de um número de 1 a 100 e confirme. Para sair apenas digite 0 e confirme.");

            do {
                
                controle = aleatorio(100, 1);
                n_usuario = ler.nextInt();

                if (n_usuario == 0) {

                    n_usuario = controle;

                } else if (n_usuario != controle) {

                    clear();
                    System.out.println("Você errou! A resposta correta era: " + controle);

                } else {

                    clear();
                    System.out.println("!! Parabens vocẽ acertou !!!");
                }

            } while (n_usuario != controle);

            System.out.println("\nObrigado por jogar");
        }
        
    }
}
