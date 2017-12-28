import java.util.Scanner;

public class Skaner {

    public static void main(String[] args){
        double a;
        double b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        a = sc.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        b = sc.nextDouble();

        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));
    }
}
