public class matricesparcial9 {
    public static final int MaxC = 23;
    public static final int MaxF = 3;

    public static int buscarini(char[] fila, int ini) {
        while (ini < MaxC && !esLetra(fila[ini])) {
            ini++;
        }
        return ini;
    }

    public static int buscarfin(char[] fila, int ini) {
        while (ini < MaxC && esLetra(fila[ini])) {
            ini++;
        }
        return ini - 1;
    }

    public static void cifrarMensaje(char[] fila) {
        int ini = 0, fin = -1;
        while (ini < MaxC) {
            ini = buscarini(fila, fin + 1);
            if (ini < MaxC) {
                fin = buscarfin(fila, ini);
                int tam = fin - ini + 1;
                int desplazamiento = modificarPalabra(fila, ini, fin, tam);
                fin += desplazamiento;
            }
        }
    }

    public static int modificarPalabra(char[] fila, int ini, int fin, int tam) {
        int desplazamiento = 0;

        for (int i = fin; i >= ini; i--) {
            char c = fila[i];
            if (esVocal(c)) {
                fila[i + desplazamiento] = (char) (c + tam); // vocal desplazada
            } else {
                // Hacemos espacio para duplicar la consonante
                if (i + desplazamiento + 1 < MaxC) {
                    correrDerecha(fila, i + desplazamiento);
                    fila[i + desplazamiento] = c;
                    fila[i + desplazamiento + 1] = c;
                    desplazamiento++;
                }
            }
        }

        return desplazamiento;
    }

    public static void correrDerecha(char[] fila, int pos) {
        for (int i = MaxC - 1; i > pos; i--) {
            fila[i] = fila[i - 1];
        }
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static boolean esLetra(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static void mostrarCifrado(char[][] matriz) {
        for (int i = 0; i < MaxF; i++) {
            for (int j = 0; j < MaxC; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] matriz = {
                { '-', 'S', 'u', 'p', 'e', 'r', ' ', 's', 'e', 'c', 'r', 'e', 't', 'o', ':', '-', '-', '-', '-', '-', '-', '-', ' ' },
                { '¡', '¡', 'n', 'o', ' ', 'c', 'o', 'r', 't', 'a', 'r', ' ', 'f', 'o', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', 'c', 'o', 'n', ' ', 'r', 'e', 't', 'u', 'r', 'n', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!' }
        };

        for (int i = 0; i < MaxF; i++) {
            cifrarMensaje(matriz[i]);
        }

        mostrarCifrado(matriz);
    }
}
