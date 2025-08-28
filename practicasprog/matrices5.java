public class matrices5 {
    // Hacer un programa que dada una matriz de enteros de tamaño
    //5*10 que se encuentra precargada, solicite al usuario un número
    //entero y elimine la primera ocurrencia de número en la matriz (un
    //número igual) si existe. Para ello tendrá que buscar la posición y si
    //está, realizar un corrimiento a izquierda y no continuar buscando.
    public static final int MaxC=10;
    public static final int MaxF=5;

    public static void busqueda (int[][]matriz, int num){
        int i =0, j=0; boolean encontrado = false;
        while (i<MaxF && !encontrado){
            while (j<MaxC && !encontrado){
                if (matriz[i][j]==num){
                    encontrado=true;
                    for (int h=j;h<MaxC-1;h++){
                        matriz[i][h]=matriz[i][h+1];
                    }
                }else
                    j++;
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
        int[][] matriz = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 22, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        System.out.println("filas: " + MaxF + " " + "Columnas: " + MaxC);
        System.out.println("ingrese fila: ");
        int fila = Utils.leerInt();
        System.out.println("ingrese posicion en columna: ");
        int columna = Utils.leerInt();
        System.out.println("ingrese numero a buscar y eliminar: ");
        int num = Utils.leerInt();
        busqueda(matriz, num);
        mostrarMatriz(matriz);
    }
}
