import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int times(int a, int b) {
        return a * b;
    }

    static int divided(int a, int b) {

        return  a / b;

    }
    static  int power(int a, int b){
        int result=1;
        for(int i=1 ; i <=b; i++) {
            result *= a;
        }
        return result;
    }
    static int fac(int a){
        int total =1;
        for (int i =1; i <=a; i++){
            total =i *total;

        }
        return total;


    }static int fact(int b) {
        int total = 1;
        for (int i = 1; i <= b; i++) {
            total = i * total;
        }
        return total;
    }
    static int mod(int a, int b){
        int result;
        result = a %b;
     return result;
    }




    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String menu = "1-Toplama işlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi \n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";


        while (true) {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            int select = inp.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("İlk sayıyı giriniz : ");

            int a = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = inp.nextInt();


            switch (select) {
                case 1:
                    System.out.println("İşleminin toplamı : " + sum(a, b));
                    break;
                case 2:
                    System.out.println("Çıkarma işlemi : " + minus(a, b));

                    break;
                case 3:
                    System.out.println(times(a, b));
                    break;
                case 4:
                    if (b == 0)
                        System.out.println("İşlem tanımsızdır. Lütfen 2. sayıyı sıfır değerinden farklı giriniz!!");
                    else
                        System.out.println("Bölme İşlemi :" + divided(a, b));
                    break;

                case 5:
                    System.out.println(power(a,b));

                    break;
                case 6:
                    System.out.println("İlk sayının faktoriyeli : " + fac(a));
                    System.out.println("İkinci sayının faktoriyeli : " + fact(b));
                    break;

                case 7:
                    System.out.println("Kalanı :" + mod(a,b));

                    break;
                case 8:
                    System.out.println("Dikdörtgenin alanı :" +times(a,b));
                    System.out.println("Dikdörtgenin çevresi :"+2 *sum(a,b));

                    break;

                default:
                    System.out.println("Yanlış sayı girdiniz!");


            }


        }
        System.out.println("Çıkış işlemi gerçekleşti. Güle güle : )) ");

    }
}










































