import Anagramass.Anagramas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Calcular anagramas de uma palavra");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite uma palavra: ");
                    String palavra = entrada.nextLine();

                    long resultado = Anagramas.calcular(palavra);

                    System.out.println("Número de anagramas de \"" + palavra + "\": " + resultado);

                    break;

                case 0:
                    System.out.println("Encerrando o programa...");

                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);

        entrada.close();
    }
}