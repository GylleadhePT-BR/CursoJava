
import java.util.Locale;
import java.util.Scanner;

public class AreasJuntas {
    public static void main(String[] args) {
        double A , B , C , tri,cir,tra,qua,retan;
        double pi = Math.PI;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro valor : ");
            A = input.nextFloat();
            System.out.println("Digite o segundo valor : ");
            B = input.nextFloat();
            System.out.println("Digite o terceiro valor : ");
            C = input.nextFloat();
        }
        tri = (A * C) / 2;

        cir = pi * Math.pow(C, 2);

        tra = (A + B) / 2 * C;

        qua = (B * B);

        retan = (A * B);
        Locale.setDefault(Locale.US);

        System.out.printf("A Àrea do triângulo é : %.3f%n", + tri);
        System.out.printf("A Àrea do círculo é : %.3f%n", + cir);
        System.out.printf("A Àrea do trapézio é : %.3f%n", + tra);
        System.out.printf("A Àrea do quadrado é : %.3f%n", + qua);
        System.out.printf("A Àrea do retângulo é : %.3f%n", + retan);

    }
}
