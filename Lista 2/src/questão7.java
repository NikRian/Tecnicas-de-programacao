import java.util.Scanner;

public class questão7 {

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {

        clear();
        
        try(Scanner ler = new Scanner(System.in)) {

            System.out.print("Digite um número: ");
            int numero = ler.nextInt();

            int maiorPrimo = 0;
            int aux = numero - 1;

            clear();

            while  (aux > 1 && maiorPrimo == 0) {

                boolean primo = true;

                for (int i = 2; i <= Math.sqrt(aux) && primo; i++) {

                    if  (aux % i == 0) {
                        primo = false;
                    }
                }

                if (primo) {

                    maiorPrimo = aux;
                } else {

                 aux--;
                }
            }

            if (maiorPrimo == 0) {
                System.out.println("Não existe numéro primo menor que" + numero + ".");
            } else {
                System.out.println("O maior número primo abaixo de " + numero + " é " + maiorPrimo + ".");
            }
        }
    }
}