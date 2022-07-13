import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz : ");
        int n = input.nextInt();

        double[] list = new double[n];
        double sum = 0.0;
        for (double j = 1; j <= n; j++) {
            for(int i =0; i< list.length; i++){
                list[i]=j;

            }
            sum += 1/j;



        }
        System.out.println(sum);



















        /*double sum =0.0;
        for ( double i =1; i <= n; i++){
            double k = 1/i;
            System.out.println(k);

        }





       /* double[] liste2 = {1,2,3,4};

        double sum=0.0;

        for( int i =0; i< liste2.length;i++){
         sum += 1/liste2[i];
          System.out.println(sum);
        }
        double average = sum / liste2.length;
         */


    }
}
