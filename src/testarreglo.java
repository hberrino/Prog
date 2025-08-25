public class testarreglo {
    public static final int MaxC=15;
    public static final int MaxF=3;
    public static final int Separador=0;

    public static int buscarini (int[]arr, int ini){
        while (ini<MaxC && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while(ini<MaxC && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static void eliminarsecuencia(int[]arr, int n){
        int ini=0;int fin =-1;
        while(ini<MaxC){
            ini=buscarini(arr, fin+1);
            if(ini<MaxC){
                fin=buscarfin(arr, ini);
                int tam=fin-ini+1;
                if (tam==n){
                    eliminarSecuencia(arr, ini, fin);
                    fin=ini+3;
                }else ini=fin+1;
            }
        }
    }
    public static void eliminarSecuencia (int[]arr, int ini, int fin) {
        int tam=fin-ini+1;
        for (int i=0;i<tam-2;i++){
            correr (arr,ini);
        }
        arr[ini]=-8;
        arr[ini+1]=20;
    }
    public static void correr (int[]arr, int pos){
        for (int i=pos;i<MaxC-1;i++){
            arr[i]=arr[i+1];
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
                {0, 120, 250, 80, 0, 0, 620, 410, 645, 0, 0, 240, 960, 0, 0},
                {0, 250, 155, 90, 85, 0, 625, 800, 0, 0, 900, 750, 225, 0, 0},
                {0, 580, 550, 850, 0, 0, 220, 110, 0, 0, 150, 480, 690, 0, 0}
        };
        System.out.println("tamaño de secuencia a eliminar si existe en fila 1: ");
        int n = Utils.leerInt();
        for(int i =0;i<MaxF;i++){
            if (i==1){
                eliminarsecuencia(matriz[i], n);
            }
        }
        mostrar(matriz);
    }
}
