
public class SumaTest {
    public static void main(String args[]){
        Suma suma = new Suma();
        System.out.println(suma.dodaj(10, 20));
        System.out.println(suma.dodaj(10.0, 20.0));
        System.out.println(suma.dodaj(10, 20, 30));
        System.out.println(suma.dodaj(10.0, 20.0, 30.0));
    }
}
