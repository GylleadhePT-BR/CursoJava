
import java.util.Scanner;

public class Diferença {
    public static void main(String[] args) {
        int num1 , num2 , num3 , num4;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        num3 = scanner.nextInt();
        System.out.print("Digite o quarto numero: ");
        num4 = scanner.nextInt();
        int calc = (num1*num2) - (num3*num4);
        System.out.println("A diferença entre o produto dos dois primeiros e o produto dos dois últimos numeros é: " + calc);
        scanner.close();  // Fecha o scanner para evitar memory leaks.  // Fecha o scanner para evitar memory leaks.
    }
    
}
