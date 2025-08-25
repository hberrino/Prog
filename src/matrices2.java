public class matrices2 {
    //Hacer un programa que dada una matriz de enteros de tamaño
    //5*10 que se encuentra precargada, obtenga la cantidad de
    //números pares que tiene y la imprima.
    public static final int MaxC=10;
    public static final int MaxF=5;

    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        buscarPares(matriz);
    }
    public static void buscarPares(int[][]matriz){
        int conteo=0;
        for (int i=0;i<MaxF;i++){
            for (int j=0;j<MaxC;j++){
                if (matriz[i][j]%2==0){
                    conteo++;
                }
            }
        }
        System.out.println("cantidad de pares en la matriz completa: "+conteo);
    }
}
