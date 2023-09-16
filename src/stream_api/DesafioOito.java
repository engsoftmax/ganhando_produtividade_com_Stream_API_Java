package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioOito {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		 int somaDigitos = numeros.stream()
	                .mapToInt(DesafioOito::somaDosDigitos)
	                .sum();

	        System.out.println("Soma dos dígitos de todos os números: " + somaDigitos);
	    }

	    private static int somaDosDigitos(int numero) {
	        int soma = 0;

	        while (numero != 0) {
	            soma += numero % 10;
	            numero /= 10; 
	        }

	        return soma;
	}

}
