package exer16;

import java.util.Scanner;

public class Exer16 {

    static double saldo = 0;

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite seu saldo inicial antes de começar: ");
            saldo = scan.nextDouble();

            while (true) {

                System.out.println("\nESCOLHA UMA OPÇÃO");
                System.out.println("1- SACAR");
                System.out.println("2- DEPOSITAR");
                System.out.println("3- SAIR");

                System.out.println("\nQual sua opção? ");
                int opcaoMenu = scan.nextInt();

                if (opcaoMenu == 3)
                    break;

                switch (opcaoMenu) {

                    case 1 -> {
                        System.out.println("Digite a quantidade que voce quer sacar: ");
                        double quantidadeSaque = scan.nextDouble();

                        while (quantidadeSaque < 0) {
                            System.out.println("Digite um valor acima de 0.");
                            quantidadeSaque = scan.nextDouble();
                        }

                        if (!sacarDinheiro(quantidadeSaque)) {
                            System.out.println("Não ha dinheiro suficiente para ser sacado:");
                            System.out.printf("Saldo Atual: %.2f\n", saldo);

                        } else {
                            System.out.println("Dinheiro sacado com Sucesso");
                            System.out.printf("Saldo Atual: %.2f\n", saldo);
                        }
                    }

                    case 2 -> {
                        System.out.println("Digite a quantidade que voce quer depositar: ");
                        double quantidadeDeposito = scan.nextDouble();

                        while (quantidadeDeposito < 0) {
                            System.out.println("Digite um valor acima de 0.");
                            quantidadeDeposito = scan.nextDouble();
                        }

                        depositarDinheiro(quantidadeDeposito);

                        System.out.println("Dinheiro Depositado com Sucesso");
                        System.out.printf("Saldo Atual: %.2f\n", saldo);
                    }

                    default -> System.out.println("Opcao invalida,tente outra novamente no menu.");
                }
            }

            System.out.println("\nSaindo do programa.....");
        }
    }

    public static boolean sacarDinheiro(double quantidadeSaque) {
        if (quantidadeSaque > saldo)
            return false;

        saldo -= quantidadeSaque;

        return true;
    }

    public static boolean depositarDinheiro(double quantidadeDeposito) {
        if (quantidadeDeposito < 0)
            return false;

        saldo += quantidadeDeposito;

        return true;
    }
}
