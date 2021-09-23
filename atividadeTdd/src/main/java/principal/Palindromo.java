package principal;

import java.util.stream.IntStream;

public class Palindromo {

    public Boolean ehPalindromo(String palavra){
        return verificarPalavra(removerCaracteresEspeciais(palavra));
    }

    private String removerCaracteresEspeciais(String palavra){
        return palavra.replaceAll("\\W", "").toUpperCase();
    }

    private Boolean verificarPalavra(String palavra){
        return IntStream.range(0, palavra.length() / 2)
                .noneMatch(i -> palavra.charAt(i) != palavra.charAt(palavra.length() -i -1));

    }

    /* Refatorado o método principal
    public Boolean verificaPalindromo(String palavra){
         String vTexto = palavra.replaceAll("\\W", "").toUpperCase();
         return IntStream.range(0, vTexto.length() / 2)
                     .noneMatch(i -> vTexto.charAt(i) != vTexto.charAt(vTexto.length() -i -1));
     }
     */
}
