public class e {
    public static final int Max = 20;

    public static int buscarini(int[] arr, int ini) {
        while (ini < Max && arr[ini] == 0) {
            ini++;
        }
        return ini;
    }

    public static int buscarfin(int[] arr, int ini) {
        while (ini < Max && arr[ini] != 0) {
            ini++;
        }
        return ini - 1;
    }

    public static boolean compararSecuencias(int[] arr1, int ini1, int fin1, int[] arr2, int ini2, int fin2) {
        if ((fin1 - ini1) != (fin2 - ini2)) return false;
        for (int i = 0; i <= (fin1 - ini1); i++) {
            if (arr1[ini1 + i] != arr2[ini2 + i]) return false;
        }
        return true;
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        int cantidad = fin - ini + 1;
        for (int i = ini; i < Max - cantidad; i++) {
            arr[i] = arr[i + cantidad];
        }
        for (int i = Max - cantidad; i < Max; i++) {
            arr[i] = 0;
        }
    }

    public static void procesar_secuencia(int[] arrorig, int[] arrpatron) {
        int ini2 = 0, fin2;
        while (ini2 < Max) {
            ini2 = buscarini(arrpatron, ini2);
            if (ini2 < Max) {
                fin2 = buscarfin(arrpatron, ini2);

                int ini1 = 0, fin1;
                while (ini1 < Max) {
                    ini1 = buscarini(arrorig, ini1);
                    if (ini1 < Max) {
                        fin1 = buscarfin(arrorig, ini1);
                        if (compararSecuencias(arrorig, ini1, fin1, arrpatron, ini2, fin2)) {
                            eliminarSecuencia(arrorig, ini1, fin1);
                            // Volver a verificar desde esta posición
                            fin1 = ini1 - 1;
                        }
                        ini1 = fin1 + 1;
                    }
                }
                ini2 = fin2 + 1;
            }
        }

        // Imprimir resultado final
        for (int i = 0; i < Max; i++) {
            System.out.print(arrorig[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrsecuencia = {0, 0, 10, 22, 2, 3, 0, 6, 13, 12, 6, 7, 0, 0, 0, 9, 10, 11, 12, 13};
        int[] patronsecuencia = {13, 12};
        procesar_secuencia(arrsecuencia, patronsecuencia);
    }
}