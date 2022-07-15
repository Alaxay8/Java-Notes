public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] += i*10;
        }
        System.out.println(java.util.Arrays.toString(numbers));
        int[] numbers1 = {1,2,3,4,5};
        for (int i = 0; i<numbers1.length;i++) {
            System.out.println(numbers1[i]);
        }

        int[] number2 = {1,2,3,4,5,6};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i< matrix.length;i++) {
            for (int j = 0; j<matrix[i].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
