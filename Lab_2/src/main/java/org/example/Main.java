import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final int maxSize = 20; // Максимальний розмір матриці (за умовою 20)
    private static final int rndMin = 1; // Мінімальне значення для генерації чисел
    private static final int rndMax = 10; // Максимальне значення для генерації чисел

    public static void main(String[] args) {
        int width, height;
        int[][] matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ширину матриці (не більше " + maxSize + "): ");
        width = scanner.nextInt();

        System.out.print("Введіть висоту матриці (не більше " + maxSize + "): ");
        height = scanner.nextInt();

        // Перевірка на максимальний розмір матриці
        if (width > maxSize || height > maxSize) {
            System.out.println("Розмір матриці перевищує максимально допустимий розмір.");
            return;
        }

        // Вибір методу створення матриці
        System.out.println("Оберіть метод створення матриці:");
        System.out.println("1 - Ввести матрицю з клавіатури");
        System.out.println("2 - Згенерувати рандомну матрицю");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix = readMatrixFromInput(width, height);
        } else if (choice == 2) {
            matrix = generateRandomMatrix(width, height);
        } else {
            System.out.println("Некоректний вибір");
            return;
        }

        System.out.println("Матриця:");
        printMatrix(matrix);

        int min = findMinimum(matrix);
        int max = findMaximum(matrix);
        double average = calculateAverage(matrix);
        double geometricMean = calculateGeometricMean(matrix);

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
        System.out.println("Середнє геометричне: " + geometricMean);
    }

    // Метод для зчитування матриці з клавіатури
    private static int[][] readMatrixFromInput(int width, int height) {
        int[][] matrix = new int[height][width];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть елементи матриці:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Метод для генерації рандомної матриці
    private static int[][] generateRandomMatrix(int width, int height) {
        int[][] matrix = new int[height][width];
        Random random = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(rndMax - rndMin + 1) + rndMin;
            }
        }

        return matrix;
    }

    // Метод для пошуку мінімального елементу в матриці
    private static int findMinimum(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }

        return min;
    }

    // Метод для пошуку максимального елементу в матриці
    private static int findMaximum(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }

    // Метод для розрахунку середнього арифметичного елементів матриці
    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        return (double) sum / count;
    }

    // Метод для розрахунку середнього геометричного елементів матриці
    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1.0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                product *= element;
                count++;
            }
        }

        return Math.pow(product, 1.0 / count);
    }

    // Метод для виведення матриці на екран
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}