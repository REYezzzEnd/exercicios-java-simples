import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int numero;
            int soma = 0;
            int quantidadeNumerosDigitados = 0;

            do {
                System.out.println("Digite um numero(digite 0 para parar): ");
                numero = scan.nextInt();

                if (numero != 0) {
                    soma += numero;
                    quantidadeNumerosDigitados++;
                }
                
            } while (numero != 0);

            System.out.println("Total de numeros digitados: " + quantidadeNumerosDigitados);
            System.out.println("Soma total dos numeros: " + soma);

        }
    }
}
