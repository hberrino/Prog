public class matrices7 {
    //Hacer un programa que dada una matriz de enteros ordenada
    //creciente por filas de tamaño 4*5 que se encuentra precargada,
    //solicite al usuario un número entero y una fila, y luego inserte el
    //número en la matriz en la fila indicada manteniendo su orden
    public static final int MaxF=4;
    public static final int MaxC=5;

    public static void insertar(int[][] matriz, int fila, int num_insertar) {
        int i = 0;
        while (i < MaxC && matriz[fila][i] < num_insertar) {
            i++;
        }
        for (int j = MaxC - 1; j > i; j--) {
            matriz[fila][j] = matriz[fila][j - 1];
        }
        matriz[fila][i] = num_insertar;
    }
    public static void mostrar (int[][]matriz){
        for (int i =0;i<MaxF;i++){
            for (int j=0;j<MaxC;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        System.out.println("ingrese fil: ");
        int fila = Utils.leerInt();
        System.out.println("ingrese numero a insertar: ");
        int num_insertar = Utils.leerInt();
        insertar (matriz, fila, num_insertar);
        mostrar(matriz);
    }
}
