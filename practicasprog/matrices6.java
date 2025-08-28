public class matrices6 {
    //Hacer un programa que dada una matriz de enteros de tamaño
    //5*10 que se encuentra precargada, solicite al usuario un número
    //entero y elimine todas las ocurrencia de número en la matriz si
    //existe. Mientras exista (en cada iteración tiene que buscar la
    //posición fila y columna) tendrá que usar dicha posición para
    //realizar un corrimiento a izquierda (quedarán tantas copias de la
    //última posición de cada fila como cantidad de ocurrencias del
    //número). Tener en cuenta, como se hizo en arreglos, si el
    //elemento a eliminar es el último de alguna fila de la matriz.
    public static final int MaxC=10;
    public static final int MaxF=5;

    public static void busqueda (int[][]matriz, int num){
        int i = 0; int j = 0; int contador = 0;
        while (i<MaxF){
            while (j<MaxC){
                if (matriz[i][j]==num){
                    for (int h=j;h<MaxC-1;h++){
                        matriz[i][h]=matriz[i][h+1];
                    }
                    matriz[i][MaxC-1]=matriz[i][MaxC-2];
                }else{
                    j++;
                }
            }
            j=0;
            i++;
        }
    }
    public static void mostrarMatriz (int[][]matriz){
        for (int i =0;i<MaxF;i++){
            for (int j=0;j<MaxC;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matriz = {{1, 10, 3, 3, 3, 6, 3, 8, 9, 10}, {1, 2, 3, 4, 3, 6, 3, 8, 9, 10}, {1, 2, 3, 4, 3, 6, 3, 8, 9, 10},
                {1, 2, 3, 4, 3, 6, 3, 8, 9, 10}, {1, 2, 3, 4, 3, 6, 3, 8, 9, 10}, {1, 2, 3, 4, 3, 6, 3, 8, 9, 10}};
        System.out.println("ingrese numero a buscar y eliminar: ");
        int num = Utils.leerInt();
        busqueda(matriz, num);
        mostrarMatriz(matriz);
    }
}
