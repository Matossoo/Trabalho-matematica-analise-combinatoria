package Anagramass;

import java.util.HashMap;
import java.util.Map;

public class Anagramas {

    public static long fatorial(int n) {
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }

    public static long calcular(String palavra) {
        Map<Character, Integer> letras = new HashMap<>();

        for (char c : palavra.toCharArray()) {
            letras.put(c, letras.getOrDefault(c, 0) + 1);
        }

        int n = palavra.length();
        long denominador = 1;

        for (int qtd : letras.values()) {
            denominador *= fatorial(qtd);
        }

        return fatorial(n) / denominador;
    }
}