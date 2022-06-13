import java.util.Scanner;

public class Main {

    static boolean check (int number){
        boolean isPrimeNumber =true;
        if (number <=1){
            isPrimeNumber =false;
        }else{
            for(int i=2; i<=number/2; i++){
                if(number % i==0){
                    isPrimeNumber =false;
                    break;
                }
            }
        }
        return isPrimeNumber;
    }










    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number please : ");
        int number = input.nextInt();

        boolean isPrimeNumber = check(number);


        if (isPrimeNumber){
            System.out.println( number + "is a prime number");
        }
        else{
            System.out.println( number + "is not a prime number");



        }


    }

}











































