package Exercises9;

public class TestLicznik {

    public static void main(String[] args) {
        double[] usa = new double[12];

        usa[0] = 3.401;
        usa[1] = 3.419;
        usa[2] = 3.4109;
        usa[3] = 3.4108;
        usa[4] = 3.3994;
        usa[5] = 3.4036;
        usa[6] = 3.4084;
        usa[7] = 3.375;
        usa[8] = 3.3376;
        usa[9] = 3.3299;
        usa[10] = 3.3375;
        usa[11] = 3.3442;

        double wynik = 0;

        for (int i = 0; i < usa.length; i++) {
            wynik = wynik + usa[i] / usa.length;
        }

        double[] euro = {4.1696, 4.1825, 4.1739, 4.1663, 4.175, 4.1696, 4.1712, 4.1637, 4.1493, 4.1477, 4.1423, 4.1461};

        double wynik2 = 0;

        for (int i = 0; i < euro.length; i++) {
            wynik2 = wynik2 + euro[i] / euro.length;
        }

        double[] funt = {4.6902, 4.706, 4.7051, 4.7216, 4.7301, 4.7301, 4.7527, 4.7563, 4.7688, 4.7489, 4.7082, 4.7061};

        double wynik3 = 0;

        for (int i = 0; i < funt.length; i++) {
            wynik3 = wynik3 + funt[i] / funt.length;
        }

        if (wynik <= usa[11] && (wynik2 <= euro[11] || wynik3 <= funt[11])) {
            System.out.println("Srednia mniejsza od ostatniej wartości kursu, Srednia = " + String.format("%.3f", wynik) + "\nOstatnia wartość kursu = " + usa[11]);
            System.out.println("\nInwestuj USA !!!");
            System.out.println("-----------------------");
        } else {
            System.out.println("Nie inwestuj w walutę USA");
            System.out.println("-----------------------");
        }

        if (wynik2 <= euro[11] && (wynik <= usa[11] || wynik3 <= funt[11])) {
            System.out.println("Srednia mniejsza od ostatniej wartości kursu, Srednia = " + String.format("%.3f", wynik2) + "\nOstatnia wartość kursu = " + euro[11]);
            System.out.println("\nInwestuj Euro !!!");
            System.out.println("-----------------------");
        } else {
            System.out.println("Nie inwestuj w walutę Euro");
            System.out.println("-----------------------");
        }

        if (wynik3 <= funt[11] && (wynik <= usa[11] || wynik2 <= euro[11])) {
            System.out.println("Srednia mniejsza od ostatniej wartości kursu, Srednia = " + String.format("%.3f", wynik3) + "\nOstatnia wartość kursu = " + funt[11]);
            System.out.println("\nInwestuj GB !!!");
            System.out.println("-----------------------");
        } else {
            System.out.println("Nie inwestuj w walutę GB");
            System.out.println("-----------------------");
        }
        if (usa[11] > usa[10] & usa[11] > usa[9] & usa[11] > usa[8] & wynik <= usa[11]) {
            System.out.println("Srednia = " + String.format("%.3f", wynik) + "\nOstatnia wartość kursu = " + usa[11]);
            System.out.println("\nInwestuj USA !!!");
            System.out.println("-----------------------");
        } else {
            System.out.println("Nie inwestuj w walutę USA");
            System.out.println("-----------------------");

        }
    }


}
