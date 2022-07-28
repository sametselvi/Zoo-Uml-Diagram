import java.util.Arrays;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter for the row : ");
        int row=input.nextInt();
        System.out.print("Please enter for the column : ");

        int column=input.nextInt();
        int [][]matris= new int[row][column];
        int number=1;
        System.out.println("The above matrix before Transpose is");
        for(int i=0; i< matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                matris[i][j]=number++;
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The above matrix after Transpose is ");

        for(int i=0; i<column;i++){
            for(int j=0; j<row;j++){
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }









    }
}