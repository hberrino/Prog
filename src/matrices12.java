public class matrices12 {
    public static final int MaxF = 4;
    public static final int MaxC = 20;
    public static final char separador = ' ';

    public static int buscarfinRev(char[][] matriz, int fila, int pos) {
        while (pos >= 0 && matriz[fila][pos] == separador) {
            pos--;
        }
        return pos;
    }

    public static int buscariniRev(char[][] matriz, int fila, int pos) {
        while (pos >= 0 && matriz[fila][pos] != separador) {
            pos--;
        }
        return pos + 1;
    }

    public static void buscarsecuencia(char[][] matriz) {
        for (int i = 0; i < MaxF; i++) {
            int fin = MaxC - 1;
            int cant = 0;
            int ini = -1;

            while (fin >= 0 && cant < 2) {
                fin = buscarfinRev(matriz, i, fin);
                if (fin >= 0) {
                    ini = buscariniRev(matriz, i, fin);
                    cant++;
                    if (cant == 2) {
                        System.out.println("Fila " + (i + 1) + " anteúltima secuencia → inicio: " + ini + ", fin: " + fin);
                    }
                    fin = ini - 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] matriz = {
                {' ', 'a', 'b', 'c', ' ', 'x', 'y', 'z', ' ', 'm', 'n', 'o', ' ', ' ', 'p', 'q', 'r', ' ', ' ', ' '},
                {' ', ' ', 'k', 'l', ' ', 'e', 'f', 'g', ' ', 'h', 'i', 'j', ' ', 'a', ' ', 'b', 'c', ' ', ' ', ' '},
                {' ', 'd', 'e', 'f', ' ', ' ', 'g', 'h', ' ', ' ', 'i', 'j', ' ', 'k', 'l', ' ', ' ', ' ', ' ', ' '},
                {' ', 'm', 'n', ' ', ' ', 'o', 'p', ' ', 'q', ' ', ' ', 'r', 's', ' ', 't', ' ', ' ', 'u', ' ', ' '}
        };
        buscarsecuencia(matriz);
    }
}
