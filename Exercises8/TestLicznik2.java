package Exercises8;

public class TestLicznik2 {

    public static void main(String[] args) {
        double [] usa = new double[10];
        usa[0] = 3.4109;
        usa[1] = 3.4108;
        usa[2] = 3.3994;
        usa[3] = 3.4036;
        usa[4] = 3.4084;
        usa[5] = 3.375;
        usa[6] = 3.3376;
        usa[7] = 3.3299;
        usa[8] = 3.3375;
        usa[9] = 3.3442;

        double [] usa2 = {3.4616, 3.4472, 3.4488, 3.4735, 3.4992, 3.4999, 3.4950, 3.4366, 3.4010, 3.4190, 3.4109, 3.4108, 3.3994, 3.4036, 3.4084, 3.375, 3.3376, 3.3299, 3.3375, 3.3442};

        double srednia=0;

        for (int i = 0; i < usa.length; i++){
            srednia = srednia + usa[i]/usa.length;
        }

        double srednia2 =0;

        for (int i = 0; i < usa2.length; i++){
            srednia2  = srednia2  + usa2[i]/usa2.length;
        }

        if (srednia <= usa[9] && srednia >= srednia2 ){
            System.out.println("Srednia mniejsza od ostatniej wartości kursu, Srednia = "  + String.format("%.3f",srednia) +"\nOstatnia wartość kursu = " +usa[9]);
            System.out.println("\nInwestuj USA !!!");
            System.out.println("-----------------------");
        } else{
            System.out.println("Nie inwestuj w walutę USA");
            System.out.println("-----------------------");
        }
    }
}