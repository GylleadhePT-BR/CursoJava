
import java.util.Scanner;

public class operadortelefonia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá seja bem vindo ao nosso sistema !!");
        System.out.println("Por favor insira seu plano :[B]básico [M]plus [P]premiun  ");
        char plano = scanner.next().charAt(0);
        System.out.println("Por favor insira o tempo de uso (em minutos) : ");
        int tempo = scanner.nextInt();
        if (plano == 'B') {
            System.out.println("Seu plano é o Básico e contem acesso a 100 minutos da nossa operadora");
            if (tempo > 100) {
                System.out.println("Você ultrapassou o tempo limite e será cobrado 2 reais adicionais ");
                int conta = tempo - 100;
                int preco = 2 * conta;
                int total = preco + 50;
                System.out.println("O preço total da sua conta é: " + total + " reais");
            } else {
                System.out.println("Você não ultrapassou o tempo limite e não será cobrado mais nada.");
            }
        }
        if (plano == 'M') {
            System.out.println("Seu plano é o Plus e contem acesso a 500 minutos da nossa operadora");
            if (tempo > 500) {
                System.out.println("Você ultrapassou o tempo limite e será cobrado 5 reais adicionais ");
                int conta = tempo - 200;
                int preco = 5 * conta;
                int total = preco + 100;
                System.out.println("O preço total da sua conta é: " + total + " reais");
            } else {
                System.out.println("Você não ultrapassou o tempo limite e não será cobrado mais nada.");
            }
        }
        if (plano == 'P') {
            System.out.println("Seu plano é o Premium e contem acesso a 1000 minutos da nossa operadora");
            if (tempo > 1000) {
                System.out.println("Você ultrapassou o tempo limite e será cobrado 10 reais adicionais ");
                int conta = tempo - 300;
                int preco = 10 * conta;
                int total = preco + 150;
                System.out.println("O preço total da sua conta é: " + total + " reais");
            } else {
                System.out.println("Você não ultrapassou o tempo limite e não será cobrado mais nada.");
            }
        }

    }
}
