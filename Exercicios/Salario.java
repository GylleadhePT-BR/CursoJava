
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        int horas;
       
        double salarioHora;
        double salarioTotal;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Olá qual o seu codigo na empresa ? : ");
            System.out.println("Quantas horas você trabalhou este mês? : ");
            horas = input.nextInt();
            System.out.println("Qual o seu salario por hora? : ");
            salarioHora = input.nextDouble();
            
            salarioTotal = salarioHora * horas;
            
            System.out.printf("Seu salario total para este mês é: R$ %.2f%n", + salarioTotal);
        }

        

    }
    
}
