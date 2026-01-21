import java.util.*;

public class Exer17 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            Map<Integer, Integer> numeros = new HashMap<>();

            while (true) {
                System.out.println("Digite os numeros(digite -10 para parar): ");
                int numero = scan.nextInt();

                if (numero == -10)
                    break;

                numeros.put(numero, numeros.getOrDefault(numero, 0) + 1);

            }

            System.out.println("Todos os numero não repetidos são: ");

            numeros.forEach((chave, valor) -> {
                if(valor == 1){
                    System.out.print(chave + " ");
                }
            });
        }
    }
}