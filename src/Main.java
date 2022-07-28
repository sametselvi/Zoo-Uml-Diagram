import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 2, 2, 6, 7, 8, 9, 0, 0, 0, 7, 6, 4, 0};
        int[] duplicate = new int[list.length];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                count++;
            }

        }
        for (int i = 0; i < list.length; i++) {
            duplicate[i] = 1;
        }


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    duplicate[i]++;

                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    list[j] = 0;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (duplicate[i] > 1) {
                if (list[i] != 0) {
                    System.out.println(list[i] + " sayisi " + duplicate[i] + " kere tekrar etti.");


                }

            }

        }
        System.out.println("0 sayisi " + count + " kere tekrar etti.");


    }
}