public class tipoparcialnew7 {
    //descompimir.
    public static final int MaxC=20;
    public static final int MaxF=3;
    public static final int Separador=0;
    public static final int X=3;
    //cantidad total de pixeles y fila con mejor cantidad.
    public static int buscarini(int[]arr, int ini){
        while(ini<MaxC && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin(int[]arr, int ini){
        while (ini<MaxC && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static int analizarMatriz (int[]arr){
        int ini=0; int fin=-1; int pixelesDescomprimidos=0;
        while(ini<MaxC){
            ini=buscarini(arr, fin+1);
            if(ini<MaxC){
                fin=buscarfin(arr, ini);
                int nuevotam=arr[ini]*(-1);
                if(haySecuencia(arr, ini, fin)){
                    descompresion(arr, ini);
                    ini=fin+1+nuevotam-2;
                    pixelesDescomprimidos+=nuevotam-2;
                }else ini=fin+1;
            }
        }
        return pixelesDescomprimidos;
    }
    public static void descompresion(int[] arr, int ini) {
        int valor = arr[ini + 1];
        int cantidad = arr[ini]*(-1);
        for (int i = 0; i < cantidad - 2; i++) {
            espacio(arr, ini + 2 + i);
        }
        for (int i = 0; i < cantidad; i++) {
            arr[ini + i] = valor;
        }
    }
    public static void espacio (int[]arr, int pos){
        for(int i=MaxC-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
    }
    public static boolean haySecuencia(int[] arr, int ini, int fin) {
        // Secuencia comprimida válida: {-n, valor}
        return (fin - ini + 1 == 2) && arr[ini] < 0 && arr[ini + 1] > 0;
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
                {0, -8, 67, 0, 14, 0, -4, 33, 0, 5, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 25, 25, 0, -5, 3, 0, 44, 44, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 44, 44, 44, 0, -7, 15, 0, -4, 9, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int pixelesDescomprimidostotal=0;
        int pixelesDescomprimidosenFila=0;
        int mejorFila=0;
        int numFila=0;
        for(int i =0;i<MaxF;i++){
            pixelesDescomprimidosenFila=analizarMatriz(matriz[i]);
            pixelesDescomprimidostotal+=pixelesDescomprimidosenFila;
            if(pixelesDescomprimidosenFila>mejorFila){
                mejorFila=pixelesDescomprimidosenFila;
                numFila=i;
            }
        }
        System.out.println("PIXELES TOTALES DESCOMPRIMIDOS: "+pixelesDescomprimidostotal);
        System.out.println("Mejor fila: "+numFila+" | "+"con: "+mejorFila);
        //cantidad total de pixeles y fila con mejor cantidad.
        mostrar(matriz);
    }
}
