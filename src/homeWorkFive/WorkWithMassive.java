package homeWorkFive;

public class WorkWithMassive {


    public int[][] createMassive(int width, int height, int value) {
        if(width == 0){
            System.out.println("Размер не может быть 0");
            width = 1;
        }
        if(height == 0){
            System.out.println("Размер не может быть 0");
            height = 1;
        }
        if(width < 0){
            System.out.println("Размер не может быть отрицательным");
            width = width * (-1);
        }
        if(height < 0){
            System.out.println("Размер не может быть отрицательным");
            height = height * (-1);
        }
        int[][] matrix = new int[width][height];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
            }
        }
        showMatrix(matrix);
        return matrix;
    }

    public void showMatrix(int[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] fillingOfLeftDiagonal(int[][] matrix, int value) {
        System.out.println("Заполняем левую диагональ");
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        matrix[i][j] = value;
                    }
                }
            }

        }else {
            System.out.println("Матрица не квадратная");

        }
        showMatrix(matrix);
        return matrix;
    }

    public int[][] fillingOfRightDiagonal(int[][] matrix, int value) {
        System.out.println("Заполняем правую диагональ");
        if (matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == matrix.length -1 - j) {
                        matrix[i][j] = value;
                    }
                }
            }

        }else {
            System.out.println("Матрица не квадратная");

        }
        showMatrix(matrix);
        return matrix;
    }
    public int[][] fillingOfBothDiagonal(int[][] matrix, int value){
        System.out.println("Заполняем обе (левую и правую)  диагональ");
        fillingOfLeftDiagonal(matrix, value);
        fillingOfRightDiagonal(matrix, value);
        return matrix;
    }

}









