import java.util.Scanner;

public class Porownanie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę: ");
        int a = sc.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        int b = sc.nextInt();

        if(a==b)
            System.out.println("Podane liczby są równe");
        else if(a > b)
            System.out.println("Pierwsza liczba jest większa");
        else
            System.out.println("Druga liczba jest większa");
        }
}

