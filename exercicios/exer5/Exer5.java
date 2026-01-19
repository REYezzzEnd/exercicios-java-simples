import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite um numero para saber sua tabuada: ");
            int numero = scan.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
            }
        }
    }
}
