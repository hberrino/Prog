public class arrays_ej6 {
    //Hacer un programa que dado un arreglo de enteros de tamaño 10
    //que se encuentra cargado, obtenga la cantidad de números pares
    //que tiene y la imprima
    public static final int Max=10;

    public static void cargarArr (int[]arr){
        for (int pos = 0;pos<Max;pos++){
            System.out.println("ingrese cada posicion");
            arr[pos] = Utils.leerInt();
        }
    }

    public static void mostrarPares (int[]arr){
        int conteo=0;
        for (int pos=0;pos <Max;pos++){
            if (arr[pos]%2==0){
                conteo++;
                System.out.println(arr[pos]);
            }
            System.out.println(arr[pos]);
        }
        System.out.println("cantida de pares: "+conteo);

    }
    public static void main (String[] args){
        int[] arregloPares = new int[Max];
        cargarArr(arregloPares);
        mostrarPares(arregloPares);
    }
}
