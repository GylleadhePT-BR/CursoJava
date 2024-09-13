import java.util.Scanner;

class AreaTrapezio {
    public static void main(String[] args) {

        double B;
        double b;
        double h;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Base maior: ");
            B = input.nextDouble();
            System.out.print("Base menor : ");
            b = input.nextDouble();
            System.out.print("Altura : ");
            h = input.nextDouble();
        }
      
        double cauc = (b + B) / 2 * h;

        System.out.println("Área do trapézio: " + cauc);


    }
}