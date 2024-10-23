
import java.util.Scanner;

public class tabeladepreco {
    public static void main(String[] args) {
        var produto = "";
        double preco = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Indique o codigo do produto por favor  : ");
        int codigo = input.nextInt();
        System.out.println("Indique a quantidade comprada : ");
        int quantidade = input.nextInt();
        switch (codigo) {
            case 1 -> {
                preco = 4.00;
                produto = "cachorro quente";
            }
            case 2 -> {
                preco = 4.50;
                produto = "X-salada";
            }
            case 3 -> {
                preco = 2.00;
                produto = "X-bacon";
            }
            case 4 -> {
                preco = 1.50;
                produto = "Refrigerante";
            }
            default -> System.out.println("Codigo invalido, favor verificar!");
    
    }
    input.close();
    double total = preco * quantidade;
    System.out.printf("O produto comprado foi %s e você comprou %d portanto o valor a ser pago é de R$ %.2f\n  " ,produto , quantidade , total);
}
}