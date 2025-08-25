public class matrizparcial4 {
    //4x15
    //cada fila es un dia, cada secuencia es una hora, cada casillero una venta.
    //Sacar de cada hora de la secuencia un promedio, y ver si esa fila es ascendente(mejora la venta)
    //si hay dos filas seguidas asi, hay mejoria.
    //la constante ej X=2. indicaria cuantas secuencias seguidas ascendentes para creer que hay mejora.
    //es decir, los promedios de las secuencias deben ser ascendentes por 2 dias al menos.
    public static final int MaxC=15;
    public static final int MaxF=4;
    public static final int MinMejora=2;
    public static final int Separador=0;

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
    public static void procesarmatriz (int[][]matriz){
        int consecutivo=0;
        for (int i =0;i<MaxF;i++){
            int ini =0; int fin = -1; double promediocomparar=-1; boolean esAscendente=true;
            while (ini<MaxC && esAscendente){
                ini=buscarini(matriz, i, fin+1);
                if(ini<MaxC){
                    fin=buscarfin(matriz, i, ini);

                    //ya tenemos secuencia. hay que promediarla
                    double promedioSecuencia=sacarpromedio(matriz, i, ini, fin);
                    if (promediocomparar != -1 && promedioSecuencia < promediocomparar) {
                        esAscendente = false;
                    }
                    System.out.println("Fila " + i + ", Secuencia [" + ini + "-" + fin + "] promedio: " + promedioSecuencia);
                    promediocomparar = promedioSecuencia;
                }

            }
            if (esAscendente){
                consecutivo++;
                if(consecutivo>=MinMejora){
                    System.out.println("hay mejora mas de dos dias");
                }
            }else consecutivo=0;
        }
    }
    public static double sacarpromedio (int[][]matriz, int fila, int ini, int fin){
        double promedio=0;
        int tam = fin-ini+1;
        for (int i=ini; i<=fin;i++){
            promedio+=matriz[fila][i];
        }
        return promedio/tam;
    }
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 625, 815, 900, 0, 562, 952, 300, 0, 365, 169, 254, 0, 0, 0},
                {0, 958, 62, 57, 221, 0, 596, 623, 600, 0, 587, 889, 984, 0, 0},
                {0, 0, 700, 257, 0, 0, 0, 854, 958, 388, 0, 954, 842, 925, 0},
                {0, 988, 899, 874, 0, 254, 258, 652, 200, 0, 568, 958, 210, 0, 0}
        };
        procesarmatriz(matriz);
    }
}
