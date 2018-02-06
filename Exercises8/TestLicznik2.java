package Exercises8;

public class TestLicznik2 {

    public static void main(String[] args) {
        double [] usa = new double[10];
        usa[0] = 3.45;
        usa[1] = 3.46;
        usa[2] = 3.465;
        usa[3] = 3.455;
        usa[4] = 3.47;
        usa[5] = 3.455;
        usa[6] = 3.465;
        usa[7] = 3.47;
        usa[8] = 3.48;
        usa[9] = 3.485;

        double [] usa2 = {3.44, 3.44, 3.44, 3.45, 3.45, 3.45, 3.45, 3.44, 3.45, 3.44, 3.46, 3.45, 3.34, 3.455, 3.445, 3.465, 3.465, 3.47, 3.48, 3.485};

        double srednia=0;

        for (int i = 0; i < usa.length; i++){
            srednia = srednia + usa[i]/usa.length;
        }

        double srednia2 =0;

        for (int i = 0; i < usa2.length; i++){
            srednia2  = srednia2  + usa2[i]/usa2.length;

        }

        if (srednia <= usa[9] & srednia >= srednia2 & srednia <= usa[9] & srednia <= usa[8] & srednia <= usa[7] ){
            System.out.println("Srednia mniejsza od ostatniej wartości kursu, Srednia = "  + String.format("%.3f",srednia) +"\nOstatnia wartość kursu = " +usa[9]);
            System.out.println("\nInwestuj USA !!!");
            System.out.println("-----------------------");
        } else{
            System.out.println("Nie inwestuj w walutę USA");
            System.out.println("Srednia 1 = "  + String.format("%.3f",srednia));
            System.out.println("Srednia 2 = "  + String.format("%.3f",srednia2));
            System.out.println("Różnica = "  + String.format("%.3f",srednia-srednia2));
            System.out.println("-----------------------");
        }
    }
}