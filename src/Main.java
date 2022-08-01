import java.util.*;


public class Main {
    static boolean isPalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {

                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrom2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);

    }
    static boolean isPalindrom3(String str) {


        char[] reverse2 = new char[str.length()];
        char[] reverse3 = new char[str.length()];

        int a = 0;


        for (int j = str.length() - 1; j >= 0; j--) {
            reverse2[a++] = str.charAt(j);
            System.out.println(Arrays.toString(reverse2));


        }

        System.out.println("-------------------");

        int b= 0;

        for (int i =0; i <= str.length()-1; i++) {

            reverse3[b++] = str.charAt(i);
            System.out.println(Arrays.toString(reverse3));

        }

        if(Arrays.equals(reverse2,reverse3)){
            System.out.println("Congrast two char arrays are the same :)");
            return true;
        }


        System.out.println("Congrast two char arrays are the different !");

        return false;










    }











    public static void main(String[] args) {



        System.out.println(isPalindrom3("kayaks"));

    }

}






