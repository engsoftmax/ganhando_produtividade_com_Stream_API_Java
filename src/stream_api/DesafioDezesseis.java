package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DesafioDezesseis {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> numerosAgrupados = numeros.stream()
           .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Números pares: " + numerosAgrupados.get(true));
        System.out.println("Números ímpares: " + numerosAgrupados.get(false));
	}
}