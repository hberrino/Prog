public class secuencias7 {
    public static final int Max = 20;

    public static boolean esAscendente(int[] arr, int ini, int fin) {
        for (int i = ini; i < fin; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int buscarfin(int[] arr, int ini) {
        while (ini < Max && arr[ini] != 0) {
            ini++;
        }
        return ini - 1;
    }

    public static int buscarini(int[] arr, int ini) {
        while (ini < Max && arr[ini] == 0) {
            ini++;
        }
        return ini;
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        int largo = fin - ini + 1;
        for (int i = ini; i + largo < Max; i++) {
            arr[i] = arr[i + largo];
        }
        for (int i = Max - largo; i < Max; i++) {
            arr[i] = 0;
        }
    }

    public static void procesar_secuencia(int[] arr) {
        int ini = 0, fin = -1;
        while (ini < Max) {
            ini = buscarini(arr, ini);
            if (ini < Max) {
                fin = buscarfin(arr, ini);
                if (esAscendente(arr, ini, fin)) {
                    eliminarSecuencia(arr, ini, fin);
                    // Volvemos a verificar desde el mismo índice
                    // porque los elementos se desplazaron a la izquierda
                } else {
                    ini = fin + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrsecuencia = {8, 9, 10, 22, 0, 0, 0, 0, 13, 5, 2, 0, 0, 0, 0, 9, 10, 11, 12, 13};
        procesar_secuencia(arrsecuencia);
        for (int arr : arrsecuencia){
            System.out.print(arr+" ");
        }
    }
}
