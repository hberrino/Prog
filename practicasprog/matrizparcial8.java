public class matrizparcial8 {
    public static final int MaxC=15;
    public static final int MaxF=3;
    public static int Separador=0;
    public static final int MaxA=3;
    public static final int Minganancia=600;
    //la fila es el mes, el tamaño de la secuencia dias.
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
    public static void analizarmatriz (int[][]matriz, int[]A1, int[]A2){
        for (int j=0;j<MaxA;j++) {
            for (int i = 0; i < MaxF; i++) {
                int ini = 0;
                int fin = -1;
                double suma=0;
                int contador_secuencias=0;
                if (A1[j]==i+1) {// si esta en arreglo A1, instrucciones de A1.
                    System.out.println("Promedio a sacar para el mes: "+A1[j]);
                    while (ini < MaxC) {
                        int actual=0;
                        ini = buscarini(matriz, i, fin + 1);
                        if (ini < MaxC) {
                            fin = buscarfin(matriz, i, ini);//tenemos secuencia de fila
                            actual=buscarmejor(matriz, i, ini, fin);
                            suma+=actual;
                            contador_secuencias++;
                            ini=fin+1;
                            System.out.print(actual+" | ");
                        }
                    }
                    System.out.println("resultado: "+suma/contador_secuencias);
                }else if (A2[j]==i+1){//si la fila coincide con arreglo A2, instrucciones A2.
                    boolean esValido = true;
                    while (ini < MaxC && esValido) {
                        ini = buscarini(matriz, i, fin + 1);
                        if (ini < MaxC) {
                            fin = buscarfin(matriz, i, ini);//tenemos secuencia de fila
                            if (!seCumple(matriz, i, ini, fin)) {
                                esValido = false; // si alguna secuencia no cumple, ya no es válido el mes
                            }
                            ini = fin + 1; // ¡importante! avanzar al final de la secuencia
                        }
                    }
                    if (esValido){
                        System.out.println("Se cumple todos los días del mes: " + A2[j] + " con un mayor a: " + Minganancia);
                    }else {
                        System.out.println("No se cumple, hay al menos un día con menor rendimiento a: " + Minganancia);
                    }
                }
            }
        }
    }
    public static int buscarmejor (int[][]matriz, int fila, int ini, int fin){
        int mejor=0;
        while (ini<=fin){
            if(matriz[fila][ini]>mejor){
                mejor=matriz[fila][ini];
            }
            ini++;
        }
        return mejor;
    }
    public static boolean seCumple (int[][]matriz, int fila, int ini, int fin){
        while (ini <= fin && matriz[fila][ini] >= Minganancia) {
            ini++;
        }
        return ini > fin;
    }
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0},
                {0, 940, 105, 265, 845, 215, 0, 245, 765, 348, 0, 741, 125, 541, 0},
                {0, 851, 600, 600, 845, 914, 0, 754, 600, 600, 637, 917, 0, 0, 0}
        };
        int[] A1 = {1,2,0}; //segun mes de arreglo(promedio suma la mas alta de cada secuencia / cant secuencia)
        int[] A2 = {3,0,0}; //segun mes de arreglo, si se supero diariamente la ganancia ej: x=600;
        analizarmatriz(matriz, A1, A2);
    }
}
