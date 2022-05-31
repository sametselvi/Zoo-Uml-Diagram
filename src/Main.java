import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Please enter the number of digits : ");
        int N = input.nextInt();


        int number1 =0, number2 =1;

        int counter =0;

        while (counter < N){

            System.out.print(number1 + " ");
            int num3 = number1 + number2;
            number1 = number2;
            number2 = num3;

            counter = counter +1;


        }
















    }
}



