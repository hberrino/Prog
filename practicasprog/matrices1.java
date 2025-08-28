public class matrices1 {
    // Hacer un programa que dada una matriz de enteros de tamaño
    //5*10 que se encuentra precargada, invierta el orden del contenido
    //por fila. Este intercambio no se debe realizar de manera explícita,
    //hay que hacer un método que incluya una iteración de
    //intercambio.
    public static final int MaxC=10;
    public static final int MaxF=5;

    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        invertir(matriz);
    }
    public static void invertir (int[][]matriz){
        for (int i=0;i<MaxF;i++){
            for (int j=MaxC-1;j>=0;j--){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
