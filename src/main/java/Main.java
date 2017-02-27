import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] weights = new int[size];
        for (int i = 0; i < size; i++) {
            weights[i] = input.nextInt();
        }
        Arrays.sort(weights);
        System.out.print(weights[0] + " " + weights[size - 1]);
    }
}