
public class PunktTest {

    public static void main(String[] args){
        Punkt punkt = new Punkt();
        punkt.x = 0;
        punkt.y = 0;

        punkt.zwiekszX();
        punkt.zwiekszY();
        punkt.wyswietl();

        punkt.zmienX(10);
        punkt.wyswietl();

        int wartosc = punkt.dajX();
        System.out.println("Wartość: "+wartosc);
    }
}
