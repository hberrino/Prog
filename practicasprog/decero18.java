public class decero18 {
    //Hacer un programa que dado un arreglo de enteros de tamaño
    //10 que se encuentra precargado, solicite al usuario un número
    //entero y elimine la primera ocurrencia del número (un número
    //igual) en el arreglo (si existe). Para ello tendrá que buscar la
    //posición y si está, realizar un corrimiento a izquierda (queda una
    //copia de la última posición del arreglo en la anteúltima posición).
    public static final int Max=10;
    public static void buscar (int[]arr, int n){
        for(int pos =0;pos<Max;pos++) {
            if(arr[pos]==n){
                for (int i=pos;i<Max-1;i++) {
                    arr[i] = arr[i + 1];
                }
            }
        }
    }
    public static void mostrar(int[]arr){
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }
    }
    public static void main(String[] args) {
        int[]arreglo = {1,2,3,4,5,23,7,8,9,10};
        System.out.println("ingrese un numero a buscar: ");
        int n = Utils.leerInt();
        int aux = arreglo[9];
        buscar(arreglo, n);
        arreglo[9]=aux;
        mostrar(arreglo);
    }
}
