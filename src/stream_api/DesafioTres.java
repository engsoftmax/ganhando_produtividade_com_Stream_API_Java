package stream_api;

import java.util.Arrays;
import java.util.List;

public class DesafioTres {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		  numeros.forEach(numero -> {
	            String resultado = (numero > 0) ? "sim" : "não";
	            System.out.println("O número " + numero + " é positivo? " + resultado);
	        });
	    }
	}