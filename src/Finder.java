import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        System.out.print("Please enter any number for the perfect number : ");

        int number;
        int result = 0;

        Scanner input = new Scanner(System.in);

        number = input.nextInt();


        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;

            }


        }

        if (result == number) {
            System.out.println(number + " is the perfect number. ");


        } else {
            System.out.println(number + " is not the perfect number.");

        }


    }
}
