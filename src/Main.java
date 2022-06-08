import java.util.Scanner;

public class Main {
    static void print(){

            System.out.println("Please enter your number : ");

    }
    static boolean isPalindrom( int number) {
        int temp = number, reverseNumber = 0, lastNumber;

    while ( temp !=0){
        lastNumber = temp %10;

        reverseNumber = (reverseNumber*10) +lastNumber;

        temp/=10;




    }

        if (reverseNumber ==number)
            return true;
        else
            return false;
    }






    public static void main(String[] args) {
        print();
        Scanner input = new Scanner(System.in);
        int number =input.nextInt();
        System.out.println(isPalindrom(number));

    }



}










































