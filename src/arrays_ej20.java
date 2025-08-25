public class arrays_ej20 {
    //Suponer a partir de lo resuelto en el ejercicio anterior (11) que
    //el elemento a eliminar coincide con el último que hay en el arreglo.
    //¿Qué pasa en este caso? ¿Cómo daría una solución al problema?
    public static final int Max=10;

    public static void busqueda (int[]arr, int num) {
        int aux = 0;
        int conteo = 0;
        for (int pos = 0; pos < Max; pos++) {
            if (arr[pos] == num && pos == Max-1)
                arr[pos] = arr[pos-1];
            else if (arr[pos] == num) {
            for (int i = pos; i < Max-1; i++) {
                arr[i] = arr[i + 1];
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
        int[]arreglo = {2,12,4,6,3,4,6,5,9,12};
        mostrar(arreglo);
        System.out.println('\n'+"ingrese un numero a buscar: ");
        int num = Utils.leerInt();
        busqueda(arreglo,num);

    }


}