import java.util.Scanner;

public class condicao {
    public static void main(String[] args) {
        System.out.println("Olá seja bem vindo !");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu nome ? :  ");
        String nome = scanner.next();
        
        if(nome.length() <= 3 ){
            System.out.println("Nossa que nome pequeno , mas é bonito , Bom dia ... ");
        }
        else{
            System.out.println("Olá "+ nome + "Bom dia..");
        }

        scanner.close();

    }
}
