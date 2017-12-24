
public class ListaPracownikowTest {
    public static void main(String[] args) {
        ListaPracownikow[] pracownicy = new ListaPracownikow[3];
        pracownicy[0] = new ListaPracownikow();
        pracownicy[1] = new ListaPracownikow("Jan", "Bazan", 25);
        pracownicy[2] = new ListaPracownikow(pracownicy[0]);

        for (ListaPracownikow p: pracownicy) {
            System.out.println(p.imie + p.nazwisko + p.wiek);
            System.out.println("----------------");


        }

    }
}
