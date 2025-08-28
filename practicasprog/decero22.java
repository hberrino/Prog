public class decero22 {
    //Hacer un programa que elimine los valores pares en un arreglo
    //de tamaño MAX=10.
    public static final int Max = 10;

    public static void busqueda_eliminar(int[] arr) {
        int i = 0;
        while (i < Max) {
            if (arr[i] % 3 == 0) {
                i++;
            } else arr[i] = 0;
        }
    }

    public static void mostrar(int[] arr) {
        for (int arreglo : arr) {
            System.out.print("|" + arreglo + "|");
        }
    }

    public static void main(String[] args) {
        int[] arregloMix = {2, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        busqueda_eliminar(arregloMix);
        mostrar(arregloMix);
    }
}
