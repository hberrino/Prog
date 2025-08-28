public class decero20 {
    //Hacer un programa que dado un arreglo de enteros de tamaño
    //10 que se encuentra precargado, solicite al usuario un número
    //entero y elimine todas las ocurrencia de número en el arreglo.
    //Mientras exista (en cada iteración tiene que buscar la posición
    //dentro del arreglo) tendrá que usar la posición para realizar un
    //corrimiento a izquierda (quedarán tantas copias de la última
    //posición del arreglo como cantidad de ocurrencias del número).

    //20. Suponer a partir de lo resuelto en el ejercicio anterior (11) que
    //el elemento a eliminar coincide con el último que hay en el arreglo.
    //¿Qué pasa en este caso? ¿Cómo daría una solución al problema?

    public static final int Max=10;
    public static boolean hayCoincidencia (int[]arr, int n){
        for (int pos = 0; pos<Max; pos++){
            if (arr[pos]==n){
                return true;
            }
        }
        return false;
    }
    public static void corrimiento (int[]arr, int n){
        for (int pos = 0; pos<Max; ) {
            if (arr[pos] == n) {
                for (int i = pos; i < Max - 1; i++) {
                    arr[i] = arr[i + 1];
                    arr[Max-1]=0;
                }
            }else
                pos++;
        }
    }
    public static void mostrar (int[]arr){
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }
    }
    public static void main(String[] args) {
        int[] arreglo = {10, 10, 10, 3, 5, 10, 2, 8, 10, 10};
        System.out.println("ingrese un numero a buscar: ");
        int n = Utils.leerInt();
        if (hayCoincidencia(arreglo, n)){
            corrimiento(arreglo, n);
            mostrar(arreglo);
        }
        else System.out.println("no hay coincidencias");
    }
}
