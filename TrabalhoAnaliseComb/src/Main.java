import java.util.HashMap;
import java.util.Map;

public class Anagramas {

    // Função para calcular fatorial
    public static long fatorial(int n) {
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }

    // Função para calcular número de anagramas
    public static long calcularAnagramas(String palavra) {
        Map<Character, Integer> letras = new HashMap<>();

        // Conta as ocorrências de cada letra
        for (char c : palavra.toCharArray()) {
            letras.put(c, letras.getOrDefault(c, 0) + 1);
        }

        int n = palavra.length();
        long denominador = 1;

        // Multiplica os fatoriais das repetições
        for (int qtd : letras.values()) {
            denominador *= fatorial(qtd);
        }

        return fatorial(n) / denominador;
    }

    public static void main(String[] args) {
        String palavra = "banana";
        long resultado = calcularAnagramas(palavra);
        System.out.println("Número de anagramas de " + palavra + ": " + resultado);
    }
}
