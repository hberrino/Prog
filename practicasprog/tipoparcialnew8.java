public class tipoparcialnew8 {
    //secuencias descendentes volverlas ascendentes
    public static final int MaxC=15;
    public static final int MaxF=3;
    public static final int Anunciar=2;
    public static final int Separador=0;

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
    public static int analizarGondolas (int[]arr){
        int ini=0; int fin =-1; int ordenamientos=0;
        while(ini<MaxC){
            ini=buscarini(arr, fin+1);
            if (ini<MaxC){
                fin=buscarfin(arr, ini);
                if (esDescendente(arr, ini, fin)){
                    invertir(arr, ini, fin);
                    ordenamientos++;
                }else ini=fin+1;
            }
        }
        return ordenamientos;
    }
    public static boolean esDescendente (int[]arr, int ini, int fin){
        while (ini<fin && arr[ini]>=arr[ini+1]){
            ini++;
        }
        return ini==fin;
    }
    public static void invertir(int[] arr, int ini, int fin) {
        while (ini < fin) {
            int temp = arr[ini];
            arr[ini] = arr[fin];
            arr[fin] = temp;
            ini++;
            fin--;
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
                {0, 250, 155, 90, 85, 0, 0, 625, 800, 0, 900, 750, 225, 0, 0},
                {0, 580, 550, 850, 0, 0, 220, 110, 0, 0, 150, 480, 690, 0, 0}
        };
        int ordenamientosDia=0;
        for (int i=0;i<MaxF;i++){
            ordenamientosDia=analizarGondolas(matriz[i]);
            if(ordenamientosDia>=Anunciar){
                System.out.println("EL ESTANTE "+(i+1)+" HUBO: "+ordenamientosDia+" ORDENAMIENTOS.");
            }
        }
        mostrar(matriz);
    }
}
