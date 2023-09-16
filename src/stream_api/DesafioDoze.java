package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DesafioDoze {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> produto = numeros.stream()
                .reduce((a, b) -> a * b);

        if (produto.isPresent()) {
            System.out.println("Produto dos números: " + produto.get());
        }
       
    }
}