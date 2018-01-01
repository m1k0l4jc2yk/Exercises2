import java.util.Scanner;

public class Tablice {

        public static void main(String[] args){
            String[] tab = new String[5];

            Scanner odczyt = new Scanner(System.in);
            //pobranie danych
            System.out.println("Podaj 5 imion");
            for(int i=0; i<5; i++)
                tab[i] = odczyt.nextLine();
            //wyświetlenie
            for(int i=0; i<5; i++)
                System.out.println("Cześć "+tab[i]);
        }
}
