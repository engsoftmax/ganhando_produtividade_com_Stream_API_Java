package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioNove {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		boolean saoDistintos = numeros.stream()
	        .allMatch(n -> numeros.stream().filter(m -> m.equals(n)).count() == 1);

	        System.out.println("Todos os números são distintos: " + saoDistintos);
	    }
	}