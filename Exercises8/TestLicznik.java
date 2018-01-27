package Exercises8;

public class TestLicznik {

    public static void main(String[] args) {
        double [] usa = new double[5];
        usa[0] = 4.32;
        usa[1] = 4.05;
        usa[2] = 4.55;
        usa[3] = 4.80;
        usa[4] = 4.32;

        double wynik=0;

        for (int i = 0; i < usa.length; i++){
            wynik = wynik + usa[i]/usa.length;
        }

        double [] euro = {4.0,4.55, 4.8, 4.93, 4.05 };

        double wynik2=0;

        for (int i = 0; i < euro.length; i++){
            wynik2 = wynik2 + euro[i]/euro.length;
        }

        double [] funt = {4.85,4.88, 4.90, 4.92, 4.80 };

        double wynik3=0;

        for (int i = 0; i < funt.length; i++){
            wynik2 = wynik2 + funt[i]/funt.length;
        }

        if (wynik >= usa[4] && wynik2 >=euro[4] || wynik3>=funt[4]){
            System.out.println("średnia większa od ostatniej wprowadzonej wartości:" + String.format("%.3f",wynik) +"\nWarto inwestować !!!");
        } else{
            System.out.println("Nie inwestuj w walutę USA");
        }


    }


}
