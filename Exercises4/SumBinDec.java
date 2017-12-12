import java.util.Scanner;

public class SumBinDec {
    public static void main(String args[])
    {
        int dec_num;
        int quot;
        int i = 1;
        int j;

        int bin_num [] = new int [100];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą : ");
        dec_num = scanner.nextInt();

        quot = dec_num;

        while (quot !=0){
            bin_num[i++] = quot%2;
            quot = quot/2;
        }

        System.out.print("Liczba w systemie binarnym to: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
