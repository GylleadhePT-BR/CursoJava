
import java.util.Scanner;

public class SenhaCorreta {

    public static void main(String[] args) {
        boolean valida = true;
        Scanner scanner = new Scanner(System.in);
        while (valida == true) {
            System.out.print("Crie sua senha: ");
            String senha = scanner.nextLine();
            int tamanho = senha.length();
            while (tamanho < 8) {
                System.out.println("Senha muito curta! Deve ter pelo menos 8 caracteres.");
                System.out.print("Crie sua senha: ");
                senha = scanner.nextLine();
                tamanho = senha.length();
            }

            System.out.println("Por favor insira a senha que você criou : ");
            String confirmaSenha = scanner.nextLine();
            if (!senha.equals(confirmaSenha)) {
                System.out.println("Senhas não conferem!");
                System.out.println("Por favor tente novamente");
            }else{
                valida = false;
                System.out.println("Senha criada com sucesso!");
                System.out.println("Sua senha é " + confirmaSenha);
                scanner.close();
                System.out.println("Bem vindo ao sistema!");
                break;
                
            }
        }
    }
    }
