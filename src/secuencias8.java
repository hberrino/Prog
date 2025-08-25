public class secuencias8 {
    //Hacer un programa que reemplace de un arreglo A todas las
    //ocurrencias de una secuencia patrón dada en un arreglo P, por la
    //secuencia contenida en el arreglo R de igual tamaño.
    public static final int Max=20;
    public static final int MaxPatron=2;
    public static final int MaxReemplazo=2;
    public static final int Separador=0;

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
    // Buscar patrón dentro de la subsecuencia
    public static int buscarPatronEnSecuencia(int[] arr, int ini, int fin, int[] patron) {
        for (int i = ini; i <= fin - MaxPatron + 1; i++) {
            boolean coincide = true;
            for (int j = 0; j < MaxPatron; j++) {
                coincide = coincide && (arr[i + j] == patron[j]);
            }
            if (coincide) return i;
        }
        return -1;
    }

    // Reemplazar desde posición específica
    public static void reemplazarDesde(int[] arr, int pos, int[] reemplazo) {
        for (int i = 0; i < MaxReemplazo; i++) {
            arr[pos + i] = reemplazo[i];
        }
    }

    // Procesar todas las secuencias en el arreglo
    public static void procesar_secuencia(int[] arr, int[] patron, int[] reemplazo) {
        int ini = 0, fin = -1;
        while (ini < Max) {
            ini = buscarini(arr, ini);
            if (ini < Max) {
                fin = buscarfin(arr, ini);
                int pos = buscarPatronEnSecuencia(arr, ini, fin, patron);
                while (pos != -1) {
                    reemplazarDesde(arr, pos, reemplazo);
                    pos = buscarPatronEnSecuencia(arr, pos + MaxReemplazo, fin, patron);
                }
                ini = fin + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrsecuencia = {8, 9, 10, 22, 0, 0, 0, 0, 13, 5, 2, 0, 8, 0, 0, 9, 10, 11, 12, 13};
        int[] patron = {8, 9};
        int[] reemplazo = {5, 5};
        procesar_secuencia(arrsecuencia, patron, reemplazo);
        for (int arr : arrsecuencia) {
            System.out.print(arr + " ");
        }
    }
}
