public class matricesaUsar {
    public static final int MaxF=4;
    public static final int MaxC=20;
    public static final int Separador=' ';
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 3, 5, 2, 0, 7, 1, 0, 4, 6, 0, 0, 2, 3, 1, 0, 9, 8, 0, 0},
                {0, 0, 4, 3, 0, 6, 5, 2, 0, 0, 8, 1, 0, 7, 0, 9, 0, 0, 0, 0},
                {0, 1, 2, 3, 0, 0, 9, 8, 0, 0, 4, 5, 0, 6, 7, 0, 0, 0, 0, 0},
                {0, 5, 3, 0, 0, 2, 1, 0, 4, 0, 0, 7, 9, 0, 8, 0, 0, 6, 0, 0}
        };
        char[][] matrizc = {
                {' ', 'a', 'b', 'c', ' ', 'x', 'y', 'z', ' ', 'm', 'n', 'o', ' ', ' ', 'p', 'q', 'r', ' ', ' ', ' '},
                {' ', ' ', 'k', 'l', ' ', 'e', 'f', 'g', ' ', 'h', 'i', 'j', ' ', 'a', ' ', 'b', 'c', ' ', ' ', ' '},
                {' ', 'd', 'e', 'f', ' ', ' ', 'g', 'h', ' ', ' ', 'i', 'j', ' ', 'k', 'l', ' ', ' ', ' ', ' ', ' '},
                {' ', 'm', 'n', ' ', ' ', 'o', 'p', ' ', 'q', ' ', ' ', 'r', 's', ' ', 't', ' ', ' ', 'u', ' ', ' '}
        };
        mostrar(matriz);
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < MaxF; i++) {
            for (int j = 0; j < MaxC; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean esDescendente(char[][] matriz, int fila, int ini, int fin) {
        while (ini < fin && matriz[fila][ini] >= matriz[fila][ini + 1]) {
            ini++;
        }
        return ini == fin;
    }
    public static boolean esAscendente(char[][] matriz, int fila, int ini, int fin) {
        while (ini < fin && matriz[fila][ini] <= matriz[fila][ini + 1]) {
            ini++;
        }
        return ini == fin;
    }
}
