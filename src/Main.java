import java.util.*;


public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner inp = new Scanner(System.in);
        int number = random.nextInt(100);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isMistake = false;
        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen tahminininizi giriniz : ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen sıfır ile 100 arasında değer giriniz !");
                if (isMistake) {
                    right++;
                    System.out.println("Çok fazla hatalı giriz yaptınız. Kalan hakkınız : " + (5 - right));


                } else {

                    isMistake = true;
                    System.out.println("Bir daha hatalı işleminizde hakkınız düşürülecektir!");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler doğru sayıyı buldunuz! " + "Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz ! ");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + "sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;

                System.out.println("Kalan hakkı : " + (5 - right));
            }

        }
        if ((!isWin)) {

            System.out.println("Kaybettiniz ");

                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));


        }


    }

}






