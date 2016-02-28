/**
 * Created by max on 26.02.16.
 */
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        System.out.println("please enter rows of matrix");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.println("please enter columns of matrix");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
            int i = 0;
            int j = 0;
            int rowCalc = row;
            int colCalc = col;
        if ( row <= col) {
            while (i <= row / 2) {
                array[i][j] = 1;
                array[rowCalc - 1][j] = 1;
                array[i][colCalc - 1] = 1;
                array[rowCalc - 1][colCalc - 1] = 1;
                colCalc -= 1;
                rowCalc -= 1;
                i++;
                j++;
            }
            if ((col - row > 2) && (row % 2 == 0)) {
                for (j = 0; j < col - row; j++) {
                    array[(row / 2) - 1][j + (row / 2) - 1] = 1;
                    array[(row / 2)][j + (row / 2) - 1] = 1;
                }
            } else {
                for (j = 0; j < col - row; j++) {
                    array[(row / 2)][j + (row / 2)] = 1;
                }
            }
        }
        else{
            while (j <= col / 2) {
                array[i][j] = 1;
                array[rowCalc - 1][j] = 1;
                array[i][colCalc - 1] = 1;
                array[rowCalc - 1][colCalc - 1] = 1;
                colCalc -= 1;
                rowCalc -= 1;
                i++;
                j++;
            }
            if ((row - col > 2) && (col % 2 == 0)) {
                for (i = 0; i < row - col-1; i++) {
                    array[i+(col/2)][(col/2)-1 ] = 1;
                    array[i+(col/2)][(col/2) ] = 1;
                }
            }
            else  {
                for (i = 0; i < row - col ; i++) {
                    array[i+(col/2)][(col/2) ] = 1;
                }
            }
        }
        for (  i= 0 ; i < row ; i++){
            for(  j = 0 ; j < col ; j++){
                System.out.print(array[i][j]+"\t");
            }System.out.println();
        }
        }
    }

