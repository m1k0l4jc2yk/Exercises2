import java.util.Arrays;

public class Tablica {
    public static void main(String[] args)
    {
        int[] array1 = {5, -20, 15};
        int[] array2 = {7, 6, -4};
        System.out.println("Array1: "+ Arrays.toString(array1));
        System.out.println("Array2: "+Arrays.toString(array2));
        int[] array_new = {array1[0], array2[2]};
        System.out.println("New Array: "+Arrays.toString(array_new));
    }
}
