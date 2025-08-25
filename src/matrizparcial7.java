public class matrizparcial7 {
   //para un x=2 (almenos 2 productos asi)
    //secuencias descendentes con minimo 2 productos, invertir a ascendente.
    public static final int MaxC=15;
    public static final int MaxF=3;
    public static final int Separador=0;
    public static final int MinP=2;

    public static int buscarini (int[][]matriz, int fila, int ini){
        while (ini<MaxC && matriz[fila][ini]==Separador){
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
        //informar la fila que mas descendente e invertir tuvo.
        int mayorcantidadfila=0;
        int mejorFila=0;
        for (int i =0;i<MaxF;i++){
            int ini =0; int fin = -1;int actualfila=0;
            while (ini<MaxC){
                ini=buscarini(matriz, i, fin+1);
                if (ini<MaxC){
                    fin=buscarfin(matriz, i, ini);
                    int tam = fin-ini+1;
                    if (esDescendente(matriz, i, ini, fin) && tam>=2){
                        invertir(matriz, i, ini, fin);
                        actualfila++;
                    }else ini=fin+1;
                }
                if (actualfila>mayorcantidadfila){
                 mayorcantidadfila=actualfila;
                 mejorFila=i;
                }
            }
        }
        if (mayorcantidadfila>=MinP) {
            System.out.println("el mayor ordenamiento fue de : " + mayorcantidadfila + " estantes, en fila: " + mejorFila);
        }
    }
    public static boolean esDescendente (int[][]matriz, int fila, int ini, int fin){
        while (ini<fin && matriz[fila][ini]>=matriz[fila][ini+1]){
            ini++;
        }
        return ini==fin;
    }
    public static void invertir (int[][]matriz, int fila, int ini, int fin){
        int temp=0;
        while (ini<=fin){
            temp=matriz[fila][ini];
            matriz[fila][ini]=matriz[fila][fin];
            matriz[fila][fin]=temp;
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
        analizarmatriz(matriz);
        mostrar(matriz);
    }
}
