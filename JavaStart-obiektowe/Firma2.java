
public class Firma2 {
    public static void main(String args[]) {
        Pracownik2[] pracownicy = new Pracownik2[4];

        String[] imiona = {"Jan", "Tomasz", "Marcin", "Krzysztof"};
        String[] nazwiska = {"Bazan", "Trawka", "Kozubek", "Kowalski"};
        int[] wiek = {30, 20, 45, 55};

        for (int i = 0; i < pracownicy.length; i++) {
            pracownicy[i] = new Pracownik2();
            pracownicy[i].imie = imiona[i];
            pracownicy[i].nazwisko = nazwiska[i];
            pracownicy[i].wiek = wiek[i];
        }

        System.out.println("Pracownicy firmy to:");
        for (int i = 0; i < pracownicy.length; i++) {
            System.out.println(pracownicy[1].imie + "," + pracownicy[i].nazwisko + "," + pracownicy[i].wiek + " lat");
        }
    }

}
