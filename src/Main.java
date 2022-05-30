import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please enter any number for the inverted triangle : ");
        Scanner inp = new Scanner(System.in);

        int number;

        number = inp.nextInt();

        for (int i = 1; i <= number; i++) {


            for (int k = 1; k <=i; k++) {
                System.out.print(" ");
            }
            for( int j =1 ; j <=2*(number -i) + 1; j++ ){

                System.out.print("*");

            }
            System.out.println();




        }
    }

}