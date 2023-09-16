package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioQuatorze {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		  int maiorPrimo = numeros.stream()
	                .filter(DesafioQuatorze::isPrimo)
	                .mapToInt(Integer::intValue)
	                .max()
	                .orElse(-1);

	        System.out.println("Maior número primo na lista: " + maiorPrimo);
	    }

	    private static boolean isPrimo(int n) {
	        if (n < 2) return false;

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}