import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyutunu giriniz :");
        int n = inp.nextInt();




        int[] list = new int[n];

        int[] duplicate = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Elemanı " + (i + 1) + "." + " giriniz :");
            int n2 = inp.nextInt();
            duplicate[i] = n2;
        }
        Arrays.sort(duplicate);
        System.out.println(Arrays.toString(duplicate));
    }
}


