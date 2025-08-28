public class matricezparcial1 {
    public static final int MaxC = 20;
    public static final int MaxF = 3;
    public static final char Separador = 'x';
    public static final int MaxB = 3;
    public static final int R = 2;

    public static int buscarini(char[][] matriz, int fila, int ini) {
        while (ini < MaxC && matriz[fila][ini] == Separador) {
            ini++;
        }
        return ini;
    }

    public static int buscarfin(char[][] matriz, int fila, int ini) {
        while (ini < MaxC && matriz[fila][ini] != Separador) {
            ini++;
        }
        return ini - 1;
    }

    public static boolean hayRepeticion(char[][] matriz, int fila, int ini, int fin) {
        int contador = 0;
        for (int i = ini; i <= fin; i++) {
            char c = matriz[fila][i];
            if (c >= 'A' && c <= 'Z') {
                contador++;
                if (contador >= R) {
                    return true;
                }
            } else {
                contador = 0;
            }
        }
        return false;
    }

    public static boolean esMaleza(char c, char[] buenas) {
        if (c >= 'a' && c <= 'z') {
            return false; // Es cultivada (minúscula)
        }
        // Verificar si es una de las buenas
        for (int j = 0; j < MaxB; j++) {
            if (c == buenas[j]) {
                return false; // Es buena, no es maleza
            }
        }
        return true; // Es mayúscula y no está en buenas
    }

    public static int eliminarmalezas(char[][] matriz, int fila, int ini, int fin, char[] buenas) {
        int eliminadas = 0;
        int i = ini;
        while (i <= fin) {
            if (esMaleza(matriz[fila][i], buenas)) {
                correr(matriz, fila, i);
                fin--; // Disminuir el fin porque eliminamos un carácter
                eliminadas++;
            } else {
                i++; // Solo avanzar si no eliminamos
            }
        }
        return eliminadas;
    }

    public static void correr(char[][] matriz, int fila, int ini) {
        for (int i = ini; i < MaxC - 1; i++) {
            matriz[fila][i] = matriz[fila][i + 1];
        }
    }

    public static void procesar_matriz(char[][] matriz, char[] buenas) {
        int eliminadastotal = 0;
        for (int i = 0; i < MaxF; i++) {
            int ini = 0;
            int fin = -1;
            while (ini < MaxC) {
                ini = buscarini(matriz, i, fin + 1);
                if (ini < MaxC) {
                    fin = buscarfin(matriz, i, ini);
                    if (hayRepeticion(matriz, i, ini, fin)) {
                        eliminadastotal += eliminarmalezas(matriz, i, ini, fin, buenas);
                    }
                    ini = fin + 1;
                }
            }
        }
        System.out.println("eliminadas total: " + eliminadastotal);
    }

    public static void mostrar(char[][] matriz) {
        for (int i = 0; i < MaxF; i++) {
            for (int j = 0; j < MaxC; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] matriz = {
                {'x', 't', 'a', 'C', 'M', 'O', 't', 'a', 'a', 't', 'O', 'C', 't', 'P', 'a', 'O', 'M', 'C', 't', 'x'},
                {'x', 'r', 'r', 'r', 'C', 'C', 'O', 'O', 'r', 'r', 'C', 'r', 'G', 'G', 'G', 'r', 'r', 'x', 'x', 'x'},
                {'x', 'm', 'G', 'P', 'h', 'h', 'L', 'G', 'G', 'O', 'h', 'h', 'm', 'm', 'O', 'B', 'M', 'C', 'x', 'x'}
        };
        char[] buenas = {'C', 'O', 'P'};
        procesar_matriz(matriz, buenas);
        mostrar(matriz);
    }
}