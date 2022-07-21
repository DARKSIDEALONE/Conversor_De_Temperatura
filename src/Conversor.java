import java.util.Scanner;

public class Conversor {
    public static void main (String [] argas){

        Scanner leia = new Scanner(System.in);
        float f, c;
        System.out.println("-- Fahrenheit para celsius--");

        System.out.println("Informe  temperatura em fahrenheit: ");

        f = leia.nextFloat();
        c = 5 * ((f-32) / 9);

        System.out.println("Graus Celsius : " + c);

    }
}
