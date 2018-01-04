import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Zapisywanie {
    public static void main(String[] args) {
        RandomAccessFile strumień = null;
        int ilośćSczytanychBajtów = 0;

        try {
            strumień = new RandomAccessFile("daneBinarne.txt", "rw");
        } catch (FileNotFoundException e) {
            System.out.println("Błąd otwierania strumienia");
        }

        try {
            strumień.writeUTF("Tomasz");
            strumień.writeInt(1991);


            strumień = new RandomAccessFile("daneBinarne.txt", "rw");
            while (strumień.read() != -1)
                ilośćSczytanychBajtów++;
        } catch (IOException e) {
            System.out.println("Błąd wejścia-wyjścia");
        }

        try {
            strumień.close();
        } catch (IOException e) {
            System.out.println("Błąd zamykania strumeinia");
        }

        System.out.println("Ilość bajtów wynosi: " + ilośćSczytanychBajtów);
    }
}
