package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioSeis {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
        boolean algumNumeroMaiorQueDez = numeros.stream()
                .anyMatch(numero -> numero > 10);
        System.out.println("Há algum número maior que 10 na lista? " + algumNumeroMaiorQueDez);
    }
}

