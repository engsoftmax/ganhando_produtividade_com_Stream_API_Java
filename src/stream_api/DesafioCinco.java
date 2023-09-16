package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class DesafioCinco {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		OptionalDouble media = numeros.stream()
	        .filter(numero -> numero > 5)
	        .mapToDouble(numero -> numero)
	        .average();

	      
	        if (media.isPresent()) {
	            System.out.println("Média dos números maiores que 5: " + media.getAsDouble());
	        } else {
	            System.out.println("Não há números maiores que 5 para calcular a média.");
	        }
	    }
	}