public class arrays_ej18 {
    //Hacer un programa que dado un arreglo de enteros de tamaño
    //10 que se encuentra precargado, solicite al usuario un número
    //entero y elimine la primera ocurrencia del número (un número
    //igual) en el arreglo (si existe). Para ello tendrá que buscar la
    //posición y si está, realizar un corrimiento a izquierda (queda una
    //copia de la última posición del arreglo en la anteúltima posición).


    public static final int Max=10;
    public static void busqueda(int[]arr, int num){
        int temp=0;
        for(int pos =0;pos<Max;pos++){
            if (arr[pos]==num){
                for(int i = pos; i<Max-1;i++){
                    arr[i]=arr[i+1];
                }
                arr[Max-1]=arr[Max-2];
            }
        }
    }
    public static void mostrarArr (int[]arr) {
        for (int pos = 0; pos < Max; pos++) {
            System.out.print(arr[pos]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arreglo = {0,1,2,3,4,5,6,7,8,9};
        mostrarArr(arreglo);
        System.out.println('\n'+"ingrese un numero a buscar en el arreglo: ");
        int num = Utils.leerInt();
        busqueda(arreglo,num);
        mostrarArr(arreglo);
    }
}
