public class arrays_ej19 {
    //Hacer un programa que dado un arreglo de enteros de tamaño
    //10 que se encuentra precargado, solicite al usuario un número
    //entero y elimine todas las ocurrencia de número en el arreglo.
    //Mientras exista (en cada iteración tiene que buscar la posición
    //dentro del arreglo) tendrá que usar la posición para realizar un
    //corrimiento a izquierda (quedarán tantas copias de la última
    //posición del arreglo como cantidad de ocurrencias del número).
    public static final int Max=15;
    public static void busqueda (int[]arr, int num){
        for (int pos=0;pos<Max;pos++){
            if (arr[pos]==num){
                for (int i = pos; i<Max-1;i++){
                    arr[i] = arr[i+1];
                }
            }
            System.out.print(arr[pos]+" ");
        }
    }
    public static void mostrar (int[]arr){
        System.out.println("ARREGLO: ");
        for (int pos =0;pos<Max;pos++){
            System.out.print(arr[pos]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arreglo = {2,3,4,6,3,4,6,5,9,21,4,65,25,4,12};
        mostrar(arreglo);
        System.out.println('\n'+"ingrese un numero a buscar: ");
        int num = Utils.leerInt();
        busqueda(arreglo,num);
    }
}
