
import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        double raioq = Math.pow(raio, 2);
        double area = Math.PI * raioq;
        scanner.close();
        System.out.printf("A área do circulo é: %.4f%n", area);  // %.2f especifica duas casas decimais
    }
    
}
