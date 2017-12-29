import java.util.Scanner;

public class PorownanieImion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj jakieś imię: ");
        String imie = sc.nextLine();

        if("Maciek".equals(imie))
            System.out.println("Cześć "+imie);
        else if("Kasia".equals(imie))
            System.out.println("Cześć "+imie);
        else if("Tomek".equals(imie))
            System.out.println("Cześć "+imie);
        else if("Sylwia".equals(imie))
            System.out.println("Cześć "+imie);
        else if("Krzysiek".equals(imie))
            System.out.println("Cześć "+imie);
        else if("Piotrek".equals(imie))
            System.out.println("Cześć "+imie);
        else
            System.out.println("Przykro mi, ale Cię nie znam");
    }
}

