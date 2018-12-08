import java.util.Scanner;
public class MaxOnMultiDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Lay so hang va cot cua mang
        System.out.println("Enter number of row: ");
        int row = input.nextInt();
        System.out.println("Enter number of column: ");
        int column = input.nextInt();
        int array[][] = new int[row][column];

        //Lay gia tri tung phan tu cua mang
        for (int i = 0; i<row ; i++){
            for(int j =0; j< column; j++){
                System.out.println("Enter array["+i+"]["+j+"]");
                array[i][j] = input.nextInt();
            }
        }
        // In ra mang array
        System.out.println("Current Array is: ");
        for (int i = 0; i<row ; i++){
            for(int j =0; j< column; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("\n");
        }

        //In ra gia tri lon nhat cua mang
        int max = array[0][0];
        int rowIndex = 0, colIndex =0;
        for (int i = 0; i<row ; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.println("Max is: " + max+ " on row: " +(rowIndex+1) + " column: "+ (colIndex+1));
    }
}
