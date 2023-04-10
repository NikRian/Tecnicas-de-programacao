import java.util.Scanner;

public class questão8 {

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clear();
        try(Scanner ler = new Scanner(System.in)) {

            System.out.print("Digite a sua conta matemática: ");
            String conta = ler.nextLine();

            int countParenteses = 0;
            int countColchetes = 0;
            int countChaves = 0;

            boolean formatada = true;

            clear();

            int i = 0;
            while (i < conta.length() && formatada) {

                char caractere = conta.charAt(i);

                if (caractere == '(') {

                    countParenteses++;
                } else if (caractere == '[') {

                    countColchetes++;
                } else if (caractere == '{') {

                    countChaves++;
                } else if (caractere == ')') {

                    if (countParenteses > 0) {

                        countParenteses--;
                    } else {

                        formatada = false;
                    }
                } else if (caractere == ']') {

                    if (countColchetes > 0) {
                        countColchetes--;
                    } else {

                        formatada = false;
                    }
                } else if (caractere == '}') {

                    if (countChaves > 0) {
                        countChaves--;
                    } else {

                        formatada = false;
                    }
                }

                i++;
            }

            if (countParenteses != 0 || countColchetes != 0 || countChaves != 0) {
                formatada = false;
            }

            if (formatada) {
                System.out.println("A expressão matemática está bem formada.");
            } else {
                System.out.println("A expressão matemática não está bem formada.");
            }
        }
    }
}