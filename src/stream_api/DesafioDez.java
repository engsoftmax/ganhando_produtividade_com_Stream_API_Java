package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DesafioDez {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Map<Integer, List<Integer>> grupos = numeros.stream()
                .filter(numero -> numero % 2 != 0)  // Números ímpares
                .filter(numero -> (numero % 3 == 0) || (numero % 5 == 0))  
                .collect(Collectors.groupingBy(numero -> {
                    if (numero % 3 == 0) return 3;
                    else return 5;
                }));

        System.out.println("Agrupamento dos números ímpares múltiplos de 3 ou 5: " + grupos);
    }
}