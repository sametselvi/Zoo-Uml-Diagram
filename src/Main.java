import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please  enter any number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        int[] list = {2, 6, -22, 55, 99, -1000};


        Arrays.sort(list);


        System.out.println(Arrays.toString(list));

        int max = list[0];
        int min = list[0];


        for (int i : list) {

            if (number > i) {
                min = i;
            }
            if (number < i) {
                max = i;
                break;
            }

        }
        System.out.println("Minimum değeri : " + min);
        System.out.println("Maximum değeri : " + max);
    }
}


