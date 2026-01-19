import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite sua idade para saber em qual etapa você está: ");
            int idade = scan.nextInt();

            while (idade <= 0) {
                System.out.println("Digite uma idade valida: ");
                idade = scan.nextInt();
            }

            String resultado = verificarIdade(idade);

            System.out.println("Voce tem " + idade + " anos, entao voce é: " + resultado);
        }
    }

    public static String verificarIdade(int idade) {
        String resultado;

        if (idade > 0 && idade <= 12) {
            resultado = "criança";

        } else if (idade > 12 && idade < 18) {
            resultado = "adolescente";

        } else if (idade >= 18 && idade < 60) {
            resultado = "adulto";

        } else {
            resultado = "idoso";
        }

        return resultado;
    }
}
