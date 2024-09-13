import java.util.Scanner;

class AreaTrapezio {
    public static void main(String[] args) {


        System.out.print("Base maior: ");
        Scanner input = new Scanner(System.in);
        double B = input.nextDouble();

        System.out.print("Base menor : ");
        Scanner input2 = new Scanner(System.in);
        double b = input2.nextDouble();
        
        System.out.print("Altura : ");
        Scanner input3 = new Scanner(System.in);
        double h = input3.nextDouble();
        
        input.close();
        input2.close();
        input3.close();
      
        double cauc = (b + B) / 2 * h;

        System.out.println("Área do trapézio: " + cauc);


    }
}