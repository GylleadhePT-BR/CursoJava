
import java.util.Scanner;


public class Soma {
    public static void main(String[] args) {

        System.out.println("Digite um numero : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Digite outro numero : ");
        Scanner input2 = new Scanner(System.in);  // Reaproveitando o Scanner para evitar perda de dados
        int num2 = input2.nextInt();
         
        int soma = num1 + num2;

        System.out.println("A soma dos dois numeros é: " + soma);
        System.out.println("Pois " + num1+ " + " + num2 + " é igual a : " + soma);

        input.close();
        input2.close();


    }
    
}