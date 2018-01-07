
public class TestTablice {
    public static void main(String[] args){
        int[] tablica = new int[50];

        for(int i=0; i<tablica.length; i++)
            tablica[i] = i+1;

        int licznik=0;
        while(licznik<tablica.length){
            System.out.print(tablica[licznik]+" ");
            licznik++;
        }
    }
}

