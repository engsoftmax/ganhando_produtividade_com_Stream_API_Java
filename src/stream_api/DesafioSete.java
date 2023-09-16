package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioSete {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		Integer segundoMaior = numeros.stream()
                .sorted((a, b) -> b.compareTo(a)) 
                .distinct() 
                .skip(1) 
                .findFirst() 
                .orElse(null); 

        if (segundoMaior != null) {
            System.out.println("O segundo maior número é: " + segundoMaior);
        } else {
            System.out.println("Não há segundo maior número na lista.");
        }
    }
}






