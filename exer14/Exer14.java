import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            List<Double> numeros = new ArrayList<>();
            int escolhaMenu;

            while (true) {
                System.out.println("ESCOLHAS DO MENU");
                System.out.println("1- Adicionar Numero");
                System.out.println("2- Mostrar Numero");
                System.out.println("3- Mostrar Média");
                System.out.println("0- Sair\n");

                System.out.printf("Sua escolha: ");
                escolhaMenu = scan.nextInt();

                if (escolhaMenu == 0)
                    break;

                switch (escolhaMenu) {

                    case 1:
                        System.out.println("\n\nDigite o numero para adiciona-lo: ");
                        double numero = scan.nextDouble();

                        if (adicionarNumero(numero, numeros)) {
                            System.out.println("Numero adicionado com sucesso!");

                        } else {
                            System.out.println("Falha ao adicionar o numero!");
                        }

                        break;

                    case 2:
                        if (numeros.isEmpty()) {
                            System.out.println("Não há numero adicionados ainda!");

                        } else {
                            String numeroGuardados = mostrarNumeros(numeros);

                            System.out.println("Os numeros guardados aqui são: " + numeroGuardados);
                        }

                        break;

                    case 3:

                        if (numeros.isEmpty()) {
                            System.out.println("Não há numero adicionados ainda! ");

                        } else {
                            double mediaNumeros = fazerMedia(numeros);

                            System.out.printf("A media dos numeros guardados é: %.2f\n", mediaNumeros);
                        }

                        break;

                    default:
                        System.out.println("Opção invalida,digite novamente");
                        break;
                }
            }
        }
    }

    public static boolean adicionarNumero(double numero, List<Double> numeros) {
        return numeros.add(numero);
    }

    public static String mostrarNumeros(List<Double> numeros) {
        String respostaRetornavel = "";
        int i = 1;

        for (double numero : numeros) {

            if (i != numeros.size()) {
                respostaRetornavel += String.valueOf(numero) + ", ";

            } else {
                respostaRetornavel += String.valueOf(numero);
            }

            i++;
        }
        return respostaRetornavel;
    }

    public static double fazerMedia(List<Double> numeros) {

        double soma = 0;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.size();
    }
}
