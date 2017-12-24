
public class ListaPracownikow {
    String imie;
    String nazwisko;
    int wiek;


    public ListaPracownikow() {
        imie = "nie podano\n";
        nazwisko = "nie podano\n";
        wiek = 25;

    }
    public ListaPracownikow ( String i, String n, int w) {
        imie = i + '\n';
        nazwisko = n + '\n';
        wiek = w + '\n';

    }
    public ListaPracownikow ( ListaPracownikow p) {
        imie = p.imie;
        nazwisko = p.nazwisko;
        wiek = p.wiek;

    }
}
