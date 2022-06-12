import java.util.Scanner;

public class Main {

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {

            result *= a;
        }

        return result;

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Alt taban sayıyı giriniz : ");
        int n1 =input.nextInt();
        System.out.println("Üst sayıyı giriniz : ");
        int n2 =input.nextInt();

        System.out.println("İşlem sonucu : " + power(n1,n2));

    }
}










































