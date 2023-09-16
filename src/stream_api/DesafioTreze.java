package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioTreze {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int valorMinimo = 5;
        int valorMaximo = 10;
        List<Integer> numerosFiltrados = numeros.stream()
                .filter(numero -> numero >= valorMinimo && numero <= valorMaximo)
                .toList(); 
      
        System.out.println("Números dentro do intervalo [" + valorMinimo + ", " + valorMaximo + "]: " + numerosFiltrados);
    }
}