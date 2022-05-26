import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Sayıları giriniz : ");

        Scanner input = new Scanner(System.in);


        int a, b, c, d;
        boolean isError = true;

        String small = "The smallest number is : ";
        String big = "The biggest number is : ";


        do {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();


            if (a <= b && b <= d && c <= d) {
                isError = true;
                System.out.println(small + a);
            } else if (b <= a && b <= c && b <= d) {
                System.out.println(small + b);
                isError = true;

            } else if (c <= a && c <= b && c <= d) {
                System.out.println(small + c);
                isError = true;

            } else if (d <= a && d <= b && d <= c) {
                System.out.println(small + d);
                isError = true;


            }
        } while (isError == false);

        if (a >= b && b >= d && c >= d) {
            System.out.println(big + a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(big + b );
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(big + c );
        } else if (d >= a && d >= b && d >= c) {
            System.out.println(big + d );
        }
    }


}

