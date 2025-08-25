public class matrizparcial6 {
    //descompresion
    public static final int MaxC=20;
    public static final int MaxF=3;
    public static final int Separador=0;
    public static int buscarini (int[][]matriz, int fila, int ini){
        while(ini<MaxC && matriz[fila][ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[][]matriz, int fila, int ini){
        while(ini<MaxC && matriz[fila][ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static void descomprimirMatriz (int[][]matriz){
        for(int i=0;i<MaxF;i++){
            int ini=0;int fin=-1;
            while(ini<MaxC){
                ini=buscarini(matriz, i, fin+1);
                if(ini<MaxC) {
                    fin = buscarfin(matriz, i, ini);
                    if(matriz[i][ini]<0) {
                        descomprimirSecuencia(matriz, i, ini);
                    }
                }
            }
        }
    }
    public static void descomprimirSecuencia(int[][] matriz, int fila, int ini) {
        int cantidad = -matriz[fila][ini];
        int valor = matriz[fila][ini + 1];

        // Hacer lugar corriendo a la derecha (cantidad - 2) posiciones
        // (porque vamos a reemplazar dos posiciones [-n, X])
        for (int i=0; i<cantidad-2; i++) {
            correrADerecha(matriz, fila, ini + i);
        }

        // Insertar el valor repetido
        for (int j = 0; j < cantidad; j++) {
            matriz[fila][ini + j] = valor;
        }
    }

    public static void correrADerecha(int[][] matriz, int fila, int pos) {
        for (int j = MaxC - 1; j >= pos; j--) { // MaxC - 2 para no pasarnos del límite
            matriz[fila][j] = matriz[fila][j-1];
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
    public static void main(String[] args) {
        int[][] matriz = {
                {0, -8, 67, 0, 14, 0, -4, 33, 0, 5, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 25, 25, 0, -5, 3, 0, 44, 44, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 44, 44, 44, 0, -7, 15, 0, -4, 9, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        descomprimirMatriz(matriz);
        mostrar(matriz);
    }
}
