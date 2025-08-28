public class decero19 {
    //Hacer un programa que dado un arreglo de enteros de tamaño
    //10 que se encuentra precargado, solicite al usuario un número
    //entero y elimine todas las ocurrencia de número en el arreglo.
    //Mientras exista (en cada iteración tiene que buscar la posición
    //dentro del arreglo) tendrá que usar la posición para realizar un
    //corrimiento a izquierda (quedarán tantas copias de la última
    //posición del arreglo como cantidad de ocurrencias del número).

    public static final int Max=10;

    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,2,5,6,7,2,9};
        System.out.println("ingrese un numero a buscar: ");
        int n = Utils.leerInt();
        busqueda_eliminar(arreglo, n);
        mostrar(arreglo);
    }
    public static void busqueda_eliminar (int[]arr, int n) {
        for (int pos = 0; pos < Max; pos++) {
            if (arr[pos] == n) {
                for (int i=pos;i<Max-1;i++){
                    arr[i]=arr[i+1];
                }
                arr[Max-1]=arr[Max-2];
            }
        }
    }
    public static void mostrar(int[]arr){
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }
    }
}
