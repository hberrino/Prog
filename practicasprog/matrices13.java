public class matrices13 {
    //Hacer un programa que dada la matriz de secuencias de
    //enteros definida y precargada, y un número entero ingresado por
    //el usuario, elimine de cada fila las secuencias de tamaño igual al
    //número ingresado.
    public static final int MaxF=4;
    public static final int MaxC=20;
    public static final int Separador=0;


    public static int buscarini (int[][]matriz, int fila, int ini){
        while (ini<MaxC && matriz[fila][ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[][]matriz, int fila, int ini){
        while (ini<MaxC && matriz[fila][ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static void busqueda (int[][]matriz, int num){
        for (int i =0;i<MaxF;i++){
            int ini =0; int fin=-1;
            while (ini<MaxC){
                ini=buscarini(matriz, i,fin+1);
                if (ini<MaxC){
                    fin=buscarfin(matriz, i, ini);
                    int tam = fin-ini+1;
                    if(tam==num){
                        eliminarsecuencia(matriz, i, ini, fin);
                        fin=ini-1;
                    }else ini=fin+1;
                }
            }
            ini=0;fin=-1;
        }
    }
    public static void eliminarsecuencia (int[][]matriz, int fila, int ini, int fin){
        for (int i=ini; i<=fin;i++){
            correr(matriz,fila,ini);
        }
    }
    public static void correr (int[][]matriz, int fila, int ini){
        for (int i=ini;i<MaxC-1;i++){
            matriz[fila][i]=matriz[fila][i+1];
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
                {0, 3, 5, 2, 0, 7, 1, 0, 4, 6, 0, 0, 2, 3, 1, 0, 9, 8, 0, 0},
                {0, 0, 4, 3, 0, 6, 5, 2, 0, 0, 8, 1, 0, 7, 0, 9, 0, 0, 0, 0},
                {0, 1, 2, 3, 0, 0, 9, 8, 0, 0, 4, 5, 0, 6, 7, 0, 0, 0, 0, 0},
                {0, 5, 3, 0, 0, 2, 1, 0, 4, 0, 0, 7, 9, 0, 8, 0, 0, 6, 0, 0}
        };
        System.out.println("Ingrese numero entero a comparar secuencias: ");
        int numero = Utils.leerInt();
        busqueda(matriz, numero);
        mostrar(matriz);
    }
}