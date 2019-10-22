import java.util.Scanner;

public class SumOfArrayColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maxtrix row count :");
        int row = sc.nextInt();
        System.out.println("Enter maxtrix column count :");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) Math.floor(Math.random() * 100);
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Enter a column number: ");
        int selectedColumn = sc.nextInt();
        int sum = 0;
        for( int i = 0; i<row;i++){
            sum+= matrix[i][selectedColumn];
        }
        System.out.println("Sum value of column "+selectedColumn+" : "+sum);
    }
}
