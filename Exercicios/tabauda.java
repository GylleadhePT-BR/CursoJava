
import java.util.Scanner;

public class tabauda {

    public static void main(String[] args) {
        String aux = "sim";

        while ("sim".equals(aux)) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Deseja Caucular alguma tabuada  ?  :  ");
                String resposta = scanner.nextLine();
                if(resposta.equals("sim")){
                   System.out.print("Qual numero deseja calcular a tabuada  ?  :  ");
                int numero = scanner.nextInt();
                System.out.println("Calculando a tabuada de " + numero + "...");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                } 
                }else{
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                }
            }

        }

    }
}
