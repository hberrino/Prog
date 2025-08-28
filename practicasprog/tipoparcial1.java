public class tipoparcial1 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static final int X = 3;

    public static void main(String[] args) {
        int[] arr = {0, 0, 45, 45, 45, 45, 45, 0, 0, 15, 0, 21, 21, 21, 21, 0, 7, 8, 0, 0};
        comprimirSecuencia(arr);
        System.out.println("Secuencia comprimida: ");
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }

    }
    public static void comprimirSecuencia(int[] arr) {
        int inicio = 0, fin = -1;
        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin + 1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                int cantidad = fin - inicio + 1;
                if (todosIguales(arr, inicio, fin) && cantidad > X) {
                    comprimirSecuencia(arr, inicio, fin);
                }
            }
        }
    }
    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }
    public static boolean todosIguales(int[] arr, int inicio, int fin) {
        boolean loson=false;
        for (int i = inicio; i <= fin; i++) {
            if (arr[i] == arr[inicio]) {
                loson=true;
            }
        }
        return loson;
    }
    public static void comprimirSecuencia(int[] arr, int inicio, int fin) {
        int cantidad = fin - inicio + 1;
        int valor = arr[inicio];
        arr[inicio] = -cantidad;
        arr[inicio + 1] = valor;
        int aCorrer = cantidad - 2;
        for (int i = fin + 1; i < MAX; i++) {
            arr[i - aCorrer] = arr[i];
        }
        for (int i = MAX - aCorrer; i < MAX; i++) {
            arr[i] = 0;
        }
    }
}
