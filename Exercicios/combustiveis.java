
import java.util.Scanner;

public class combustiveis {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int contador1 = 0;
            int contador2 = 0;
            int contador3 = 0;
            boolean start = true;
            System.out.println("Olá, Voce deseja responder nossa pesquisa sobre combustiveis ? \n[sim] \n[nao] \n :");
            String resposta = input.nextLine();
            if (resposta.startsWith("s")) {
                while (start) {
                    System.out.println("Por favor digite Quais combustiveis você mais Ultiliza \n[1]Alcool \n[2]Gasolina \n[3]Diesel :");
                    int combustivel = input.nextInt();
                    switch (combustivel) {
                        case 1 -> {
                            System.out.println("Combustivel escolhido: Alcool");
                            contador1++;
                        }
                        case 2 -> {
                            System.out.println("Combustivel escolhido: Gasolina");
                            contador2++;
                        }
                        case 3 -> {
                            System.out.println("Combustivel escolhido: Diesel");
                            contador3++;
                        }
                        case 4 -> {
                            System.out.println("Obrigado por responder nossa pesquisa!");
                            System.out.println("TABELA\nAlcool: " + contador1 + "\nGasolina: " + contador2 + "\nDiesel: " + contador3);
                            start = false;
                        }
                        default ->
                            System.out.println("Combustivel inválido!");
                    }
                }

            }else{
                System.out.println("Ok , tenha um Bom dia ");
            }

        }
    }

}
