package TddTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import principal.Palindromo;

import java.util.ArrayList;
import java.util.List;

public class PalindromoTest {

    private final Palindromo palindromo = new Palindromo();

    @Test
    @DisplayName("Verifica se o palindromo é verdadeiro")
    public void palindromoVerdadeiro() {
        List<String> listaDePalindromo = listaPositiva();
        listaDePalindromo.forEach(item -> {
            Assertions.assertTrue(palindromo.ehPalindromo(item));
            System.out.printf("O texto: %s é um palíndromo.%n", item);
        });
    }

    @Test
    @DisplayName("Verifica se o palidromo eh falso")
    public void palindromoFalso() {
        List<String> listaDePalindromo = listaNegativa();
        listaDePalindromo.forEach(item -> {
            Assertions.assertFalse(palindromo.ehPalindromo(item));
            System.out.printf("O texto: %s não é um palíndromo.%n", item);
        });
    }

    private List<String> listaPositiva() {
        List<String> listaDePalindromo = new ArrayList<>();
        listaDePalindromo.add("Rotator");
        listaDePalindromo.add("bob");
        listaDePalindromo.add("madam");
        listaDePalindromo.add("mAlAyAlam");
        listaDePalindromo.add("1");
        listaDePalindromo.add("Able was I, ere I saw Elba");
        listaDePalindromo.add("Madam I’m Adam");
        listaDePalindromo.add("Top spot!");
        listaDePalindromo.add("02/02/2020");
        return listaDePalindromo;
    }

    private List<String> listaNegativa() {
        List<String> listaDePalindromo = new ArrayList<>();
        listaDePalindromo.add("xyz");
        listaDePalindromo.add("elephant");
        listaDePalindromo.add("Country");
        listaDePalindromo.add("Top . post!");
        listaDePalindromo.add("Wonderful-fool");
        listaDePalindromo.add("Wild imagination!");
        return listaDePalindromo;
    }

}
