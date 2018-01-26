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

        double [] euro = new double[5];
        usa[0] = 4.0;
        usa[1] = 4.55;
        usa[2] = 4.8;
        usa[3] = 4.95;
        usa[4] = 4.85;

        double wynik2=0;

        for (int i = 0; i < euro.length; i++){
            wynik2 = wynik2 + euro[i]/usa.length;
        }

        if (wynik >= usa[4] && wynik2 >=euro[4]){
            System.out.println("średnia większa od ostatniej wprowadzonej wartości:" + String.format("%.3f",wynik) +"\n Warto inwestować !!!");
        } else{
            System.out.println("Nie inwestuj w walutę USA");
        }


    }


}
