import java.util.ArrayList;
import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            ArrayList<Integer> idades = new ArrayList<>();
            int somaIdades = 0;
            int maiorIdade = 0;
            int menorIdade = 0;
            double mediaIdades;

            while (true) {
                System.out.println("Digite as idades(digite 0 para parar): ");
                int idade = scan.nextInt();

                if (idade == 0)
                    break;

                idades.add(idade);
                somaIdades += idade;

                if (idade < 18) {
                    menorIdade++;
                } else {
                    maiorIdade++;
                }
            }

            mediaIdades = somaIdades / idades.size();

            System.out.printf("Todas as idades: ");
            for (int i = 0; i < idades.size(); i++) {
                if (i != idades.size() - 1) {
                    System.out.printf("%d, ", idades.get(i));

                } else {
                    System.out.printf("%d", idades.get(i));
                }
            }

            System.out.printf("\n\nQuantidade de menores de idade: %d", menorIdade);
            System.out.printf("\nQuantidade de maiores de idade: %d", maiorIdade);
            System.out.printf("\nQuantidade media das idades: %.2f", mediaIdades);
        }
    }
}