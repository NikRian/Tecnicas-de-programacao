import java.util.Scanner;

public class questão9 {

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void permutacao(String prefix, String str) {

        int tamanho = str.length();

        if (tamanho == 0) {

            System.out.println(prefix);

        } else {

            for (int aux = 0; aux < tamanho; aux++) {

                String novaPrefixo = prefix + str.charAt(aux);
                String novoStr = str.substring(0, aux) + str.substring(aux + 1, tamanho);
                permutacao(novaPrefixo, novoStr);
            }
        }
    }

    public static void main(String[] args) {
        clear();

        try(Scanner ler = new Scanner(System.in)) {
            
            String frase = ler.next();
            clear();
            permutacao("",frase);
        }
    }
}
