import java.util.Scanner;

public class questão2 {

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        
        clear();

        try(Scanner ler = new Scanner(System.in)) {

            int entrada;
            int soma = 0;

            System.out.println("Insira e confirme os números que deseja somar, para ver o resultado insira um número negativo");

            do {
                
                entrada = ler.nextInt();

                if (entrada > 0)
                {
                    soma += entrada;
                }
                
            } while (entrada > 0);

            System.out.println("\nA soma total é: "+ soma);
        }
        
    }
}
