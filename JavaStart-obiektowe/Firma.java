
public class Firma {
    public static void main(String args[]){
        Pracownik pracownik1 = new Pracownik(),
            pracownik2 = new Pracownik(),
            pracownik3 = new Pracownik();

        pracownik1.imie = "Jan";
        pracownik1.nazwisko = "Bazan";
        pracownik1.wiek = 50;

        pracownik2.imie = "Tomasz";
        pracownik2.nazwisko = "Kozik";
        pracownik2.wiek = 45;

        pracownik3.imie = "Marcin";
        pracownik3.nazwisko = "Zięba";
        pracownik3.wiek = 40;

        System.out.println("Pracownicy firmy to:");
        System.out.println(pracownik1.imie+" "+pracownik1.nazwisko+", "+pracownik1.wiek+" lat");
        System.out.println(pracownik2.imie+" "+pracownik2.nazwisko+", "+pracownik2.wiek+" lat");
        System.out.println(pracownik3.imie+" "+pracownik3.nazwisko+", "+pracownik3.wiek+" lat");
    }
}
