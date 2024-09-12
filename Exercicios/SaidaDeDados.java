import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String prod1 ="Computer";
        String prod2 ="Office desk";

        int age = 30; 
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.println("Products : ");
        System.out.printf(prod1 + ", Which price is $ %.2f%n ", + price1);
        System.out.printf(prod2 + ", Which price is $ %.2f%n ", + price2);
        System.out.println("");
        System.out.println("");
        System.out.printf("Measue with eight decimal places : %.8f%n", + measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", + measure);
        System.out.println("");
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", + measure);
        }






}
