import javafx.scene.control.Tab;

public class LiczbyNiP {

    public static void main(String[] args) {

        LiczbyNiP liczby = new LiczbyNiP();
        liczby.Nieparzyste();
        liczby.Parzyste();
    }

    public void Nieparzyste () {

        System.out.println("Liczby Nieparzyste: ");
        System.out.println("----------------------------");

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void Parzyste() {
        System.out.println("Liczby Parzyste: ");
        System.out.println("----------------------------");
        for (int a = 1; a < 100; a++) {
            if (a % 2 == 0)
                System.out.println(a);
        }
    }
}
