public class matrices4 {
    //Hacer un programa que dada una matriz de enteros de tamaño
    //5*10 que se encuentra precargada, solicite al usuario un número
    //entero y una posición fila, columna. Con estos datos tendrá que
    //realizar un corrimiento a derecha (se pierde el último valor en
    //dicha fila) y colocar el número en la matriz en la posición fila,
    //columna indicada.
    public static final int MaxC=10;
    public static final int MaxF=5;

   public static void corrimiento_insertar (int[][]matriz, int fila, int columna, int num){
       for (int i = 0;i<MaxF;i++){
           for (int j = 0;j<MaxC;j++){
               if (i==fila && j==columna){
                   for (int h=MaxC-1; h>=j;h--){
                       matriz[i][h]=matriz[i][h-1];
                   }
                   matriz[i][j]=num;
               }
           }
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
        int[][] matriz = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("filas: "+MaxF+" "+"Columnas: "+MaxC);
        System.out.println("ingrese fila: ");
        int fila=Utils.leerInt();
        System.out.println("ingrese posicion en columna: ");
        int columna = Utils.leerInt();
        System.out.println("ingrese numero a insertar: ");
        int num = Utils.leerInt();
        corrimiento_insertar (matriz, fila, columna, num);
        mostrarMatriz(matriz);
    }
}
