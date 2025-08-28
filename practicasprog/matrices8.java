public class matrices8 {
    //Hacer un programa que dada una matriz de enteros ordenada
    //creciente por filas de tamaño 4*5 que se encuentra precargada,
    //solicite al usuario un número entero y una fila, y elimine la primera
    //ocurrencia de número en la fila indicada (un número igual) si
    //existe.
    public static final int MaxF=4;
    public static final int MaxC=5;
    public static void eliminar_ocurrencia (int[][]matriz, int fila, int num_insertar){
        int i =0;
        while (i<MaxC){
            if (matriz[fila][i]==num_insertar){
                for (int j=i;j<MaxC-1;j++){
                    matriz[fila][i]=matriz[fila][i+1];
                }
            }else i++;
        }
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
        eliminar_ocurrencia (matriz, fila, num_insertar);
        mostrar(matriz);
    }
}
