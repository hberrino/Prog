public class matrizparcial5 {
    public static final int MaxC=20;
    public static final int MaxF=3;
    public static final int Separador=0;
    public static final int MinxSec=3;
    //hacer la compresion solo si toda la secuencia es igual y su tamaño mayor a MinxSec(3).
    //poner ini[0]=-contador, y en [1]=entero q se comprimio.
    public static int buscarini (int[][]matriz, int fila, int ini){
        while(ini<MaxC && matriz[fila][ini]==Separador){
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
    public static void analizarmatriz (int[][]matriz){
        int filaMayorCompresion=-1;
        int largoMax=-1;
        int espacioTotalSalvado=0;
        for (int i=0;i<MaxF;i++){
            int ini=0; int fin = -1;
            while(ini<MaxC){
                ini=buscarini(matriz, i, fin+1);
                if (ini<MaxC){
                    fin=buscarfin(matriz, i, ini);
                    if (secuenciaValida(matriz, i, ini, fin)){
                        int largoActual=fin-ini+1;
                        espacioTotalSalvado+=comprimirSecuencia(matriz, i, ini, fin, largoActual);
                        if(largoMax < largoActual) {
                            largoMax = largoActual;
                            filaMayorCompresion=i;
                        }
                        ini=0;fin=-1;
                    }
                }
            }
        }
        System.out.println("Espacio ahorrado: "+espacioTotalSalvado*4+" Bytes");
        System.out.println("Secuencia mas larga comprimida: "+largoMax);
        System.out.println("Fila con mayor compresion: "+filaMayorCompresion);
    }
    public static boolean secuenciaValida (int[][]matriz, int fila, int ini, int fin){
        int tam = fin-ini+1;
        if (tam<MinxSec){
            return false;
        }
        while (ini<fin && matriz[fila][ini]==matriz[fila][ini+1]){
            ini++;
        }
        return ini==fin;
    }
    public static int comprimirSecuencia (int[][]matriz, int fila, int ini, int fin, int tam){
        int contador=0;
        for(int i =ini+2;i<=fin;i++){
            correr(matriz, fila, ini);
            contador++;
        }
        matriz[fila][ini+1]=matriz[fila][ini];
        matriz[fila][ini]=tam*(-1);
        return contador;
    }
    public static void correr (int[][]matriz, int fila, int pos){
        for (int i=pos; i<MaxC-1;i++){
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
                {0, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 22, 22, 22, 0, 0, 98, 0, 0, 0},
                {0, 23, 45, 45, 45, 23, 0, 88, 88, 88, 88, 88, 0, 0, 78, 78, 0, 0, 0, 0},
                {0, 0, 0, 45, 45, 0, 45, 45, 45, 45, 0, 45, 45, 0, 45, 0, 0, 0, 0, 0}
        };
        analizarmatriz(matriz);
        mostrar(matriz);
    }
}