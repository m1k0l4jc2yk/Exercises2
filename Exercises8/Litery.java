import java.util.Scanner;

public class Litery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String from capital letters: ");
        String line = sc.nextLine();
        line = line.toLowerCase();
        System.out.println(line);

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Input a String from lowercase letters: ");
        String line2 = sc2.nextLine();
        line2 = line.toUpperCase();
        System.out.println(line2);
    }

}
