import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number;

        System.out.print("Please enter any number : ");
        number = inp.nextInt();


        for (int i = 1; i <= number; i++) {
            if (i == 2 || i == 3 || i == 5) {


                System.out.println(i + " is the prime number.");
            } else {

                if (i == 1) {

                    System.out.println(i + " is a simple number.");

                } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                    System.out.println(i + " is a simple number.");


                } else {


                    System.out.println(i +  " is the prime number.");


                }
            }
        }
    }
}



