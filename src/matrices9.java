import java.util.Scanner;

public class matrices9 {
    public static final int MaxF = 4;
    public static final int MaxC = 5;

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 3, 4, 2, 5},
                {1, 4, 3, 2, 5},
                {3, 2, 1, 4, 5},
                {5, 2, 1, 3, 4}
        };

        Scanner sc = new Scanner(System.in);

        mostrar(matriz);

        System.out.println("Ingrese número de fila (0 a 3): ");
        int fila = sc.nextInt();

        System.out.println("Ingrese primer número de columna (0 a 4): ");
        int col1 = sc.nextInt();

        System.out.println("Ingrese segundo número de columna (0 a 4): ");
        int col2 = sc.nextInt();

        // Validar y normalizar col1 y col2
        if (col1 > col2) {
            int temp = col1;
            col1 = col2;
            col2 = temp;
        }

        ordenarParcial(matriz, fila, col1, col2);

        System.out.println("Matriz luego de ordenar entre columnas " + col1 + " y " + col2 + ":");
        mostrar(matriz);
    }

    // Ordena parcialmente una fila entre dos columnas (inclusive)
    public static void ordenarParcial(int[][] matriz, int fila, int col1, int col2) {
        for (int i = col1; i < col2; i++) {
            for (int j = col1; j < col2 - (i - col1); j++) {
                if (matriz[fila][j] > matriz[fila][j + 1]) {
                    int temp = matriz[fila][j];
                    matriz[fila][j] = matriz[fila][j + 1];
                    matriz[fila][j + 1] = temp;
                }
            }
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < MaxF; i++) {
            for (int j = 0; j < MaxC; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}