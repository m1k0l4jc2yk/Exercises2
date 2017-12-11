
import java.util.Scanner;

public class Ex1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę");
        double i1 = sc.nextDouble();

        System.out.println("Podaj pierwsza liczbę");
        double i2 = sc.nextDouble();

        System.out.println("Wartość mnożenia 2 podanych liczb = " + (i1 * i2 ));
        System.out.println("Wartość dzielenia 2 podanych liczb = " + (i1 / i2 ));
        System.out.println("Reszta dzielenia 2 podanych liczb = " + (i1 % i2 ));
        System.out.println("Srednia 2 podanych liczb = " + (i1 + i2 ) / 2);
    }
}
