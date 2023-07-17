import java.util.ArrayList;
import java.util.Scanner;

public class ColumnSum {
    static ArrayList<Integer> findColumnSum(int[][] matrix, int rows, int cols){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < cols; i++){
            int sum = 0;
            for(int j = 0; j < rows; j++){
                sum+=matrix[j][i];
            }
            result.add(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Array elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(findColumnSum(matrix, rows, cols));
    }
}
