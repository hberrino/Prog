public class cargasmuestrasARRAYS {
    public static final int Max=10;


    public static void main (String [] args){
        int[] arreglo = new int[Max];
        cargarArr(arreglo);
        mostrarArr(arreglo);


    }
    public static void mostrarArr (int[] arr){
        for (int i=0; i<Max; i++){
            System.out.println(arr[i]);
        }
    }

    public static void cargarArr (int[] arr){
        for (int i = 0; i < Max; i++){
            System.out.println("ingrese el numero a guardar en el puesto"+" "+(i+1)+":");
            arr[i] = Utils.leerInt();
        }
    }
}
