import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            List<Double> notas = new ArrayList<>();
            double media = 0;

            System.out.println("Digite as notas do aluno (digite -1 para parar): ");
            
            while (true) { 
             
                System.out.println("Digite a " + (notas.size() + 1) + "º nota: ");
                double nota = scan.nextDouble();

                while((nota < 0 && nota != -1) || nota > 10){
                    System.out.println("Digite um numero entra 0 e 10 ( ou -1 para parar): ");
                    nota = scan.nextDouble();
                }
                if(nota == -1) break;

                media += nota;
                notas.add(nota);
            }

            media = !notas.isEmpty() ? media / notas.size() : 0;

            for(int i = 0; i < notas.size(); i++){
                System.out.printf("Nota %d = %.2f\n", i + 1, notas.get(i));
            }

            if(media >= 7){
                System.out.printf("\nParabens,voce passou com media %.2f", media);
            }else{
                System.out.printf("\nPessimo,voce reprovou com media %.2f", media);
            }
        }
    }
}
