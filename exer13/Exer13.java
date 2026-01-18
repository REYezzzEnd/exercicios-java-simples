import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            List<Double> notas = new ArrayList<>();

            System.out.println("Digite as notas abaixo(digite -1 para parar): ");

            int i = 1;

            while (true) {
                System.out.println("Digite a nota " + i + " entre 0 e 10: ");
                double nota = scan.nextDouble();

                while ((nota < 0 && nota != -1) || nota > 10) {
                    System.out.println("A nota ''" + nota + "'' nao é valida. Digite entre 0 e 10: ");
                    nota = scan.nextDouble();
                }

                if(nota == -1) break;

                notas.add(nota);
                i++;
            }

            if (notas.isEmpty()) {
                System.out.println("A lista esta vazia.");
            } else {
                double media = fazerMedia(notas);

                System.out.printf("\n\n A media das suas notas são: %.2f", media);
            }
        }
    }

    public static double fazerMedia(List<Double> notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }
        
        return soma / notas.size();
    }
}
