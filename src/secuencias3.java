public class secuencias3 {
    //Hacer un programa que devuelva la posición de inicio y fin de la
    //anteúltima secuencia de números distintos de ceros.

    public static final int Max=20;
    public static void procesar_secuencia (int[]arr){
        int ini = 0, fin = -1, anteUltIni = 0, anteUltFin = 0, ultIni = 0, ultFin = 0;
        while (ini<Max){
            ini = buscarini(arr, ini);
            if (ini < Max){
                fin = buscarfin(arr, ini);
            }
            anteUltIni = ultIni;
            anteUltFin = ultFin;
            ultIni = ini;
            ultFin = fin;
            ini = fin+1;
        }
        System.out.println(anteUltIni+" "+anteUltFin);
    }
    public static int buscarini (int[]arr, int ini){
        while (ini<Max && arr[ini]==0){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while (ini<Max && arr[ini]!=0){
            ini++;
        }
        return ini-1;
    }
    public static void main(String[] args) {
        int[] arrsecuencia = {0, 0, 10, 22, 2, 3, 0, 0, 13, 12, 6, 7, 8, 0, 0, 9, 10, 11, 12, 13};
        procesar_secuencia(arrsecuencia);
    }
}
