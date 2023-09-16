package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioOnze {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        double somaDosQuadrados = numeros.stream()
           .mapToDouble(numero -> Math.pow(numero, 2))
           .sum();

        System.out.println("Soma dos quadrados dos números: " + somaDosQuadrados);
    }
}