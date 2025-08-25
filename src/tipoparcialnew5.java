public class tipoparcialnew5 {
    public static final int MaxC=20;
    public static final int MaxF=3;
    public static final int Separador=0;
    public static final int MinxSec=3;
    //hacer la compresion solo si toda la secuencia es igual y su tamaño mayor a MinxSec(3).
    //poner ini[0]=-contador, y en [1]=entero q se comprimio.
    public static int buscarini (int[]arr, int ini){
        while(ini<MaxC && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while (ini<MaxC && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static int analizarDia (int[]arr){
        int ini=0;int fin=-1; int compresion=0;
        while (ini<MaxC){
            ini=buscarini(arr, fin+1);
            if(ini<MaxC){
                fin=buscarfin(arr, ini);
                if(esValida(arr, ini, fin)){
                    compresion+=comprimir(arr, ini, fin);
                    ini=fin-compresion+1;
                }else ini=fin+1;
            }
        }
        return compresion;
    }
    public static boolean esValida (int[]arr, int ini, int fin){
        int tam=fin-ini+1;
        if(tam<MinxSec){
            return false;
        }
        while (ini<fin && arr[ini]==arr[ini+1]) {
            ini++;
        }
        return ini==fin;
    }
    public static int comprimir (int[]arr, int ini, int fin){
        int tam=fin-ini+1; //este va en pos ini.
        arr[ini]=-tam;
        for(int i=ini+1;i<fin;i++){
            correr(arr, i);
            fin--;
            i--;
        }
        return tam-2;
    }
    public static void correr(int[]arr, int pos){
        for(int i=pos;i<MaxC-1;i++){
            arr[i]=arr[i+1];
        }
    }
    public static void mostrar (int[][]matriz) {
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
        int espacioAhorrado=0;
        for(int i=0;i<MaxF;i++){
            espacioAhorrado+=analizarDia(matriz[i]);
        }
        mostrar(matriz);
        System.out.println("Espacio ahorrado: "+espacioAhorrado*4+" bytes");
    }
}
