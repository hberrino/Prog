public class Parcial030625T1 {
    final static int MAXT = 25;
    final static int MINUTOSXHORA = 60;

    public static void main(String[] args) {
        int[] arrT = {-6, -8, 10, 12, 14, 15, 20, -1, 15, 14, 13, 16, -8, -10, 2, 3, 5, 16, 26, -3, 56, 52, 54, 60, -7};
        int ini = 0;
        int fin = -1;
        int indiceMaquina = 0;

        while (ini < MAXT) {
            ini = buscarInicio(arrT, fin + 1);
            if (ini < MAXT) {
                fin = buscarFin(arrT, ini);
                indiceMaquina++;
                if (tieneDesperfecto(arrT, ini, fin)) {
                    System.out.println("La maquina " + indiceMaquina + " presenta un indicio de desperfecto.");
                }
                else {
                    transformarHoraMinuto(arrT, ini, fin);
                    fin = ini + 1;
                }
            }
        }
        mostrar(arrT);
    }

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXT && arr[pos] < 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXT && arr[pos] >= 0) {
            pos++;
        }
        return pos - 1;
    }

    public static boolean tieneDesperfecto(int[] arr, int ini, int fin) {
        while (ini < fin && arr[ini] <= arr[ini + 1])
            ini++;

        return ini == fin;
    }

    public static void transformarHoraMinuto(int[] arr, int ini, int fin) {
        int totalMinutos = sumarElementos(arr, ini, fin);
        int horas = totalMinutos / MINUTOSXHORA;
        int minutos = totalMinutos % MINUTOSXHORA;

        arr[ini] = horas;
        arr[ini + 1] = minutos;

        eliminarSecuencia(arr, ini + 2, fin);
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++)
            correrAIzquierda(arr, ini);
    }

    public static void correrAIzquierda(int[] arr, int pos) {
        while (pos < MAXT - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static int sumarElementos(int[] arr, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++)
            suma += arr[i];

        return suma;
    }

    public static void mostrar(int[] arr) {
        for (int i = 0; i < MAXT; i++) {
            System.out.print(" | " + arr[i]);
        }
        System.out.println();
    }
}
