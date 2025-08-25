public class arrays_ej5 {
    //Hacer un programa que dado un arreglo de caracteres de tamaño
    //MAX que se encuentra cargado, invierta el orden del contenido.

    public static final int Max=5;

    public static void cargaArr (int[] arr){
        for (int pos = 0; pos < Max; pos++){
            System.out.println("ingrese un numero para cada posicion: ");
            arr[pos] = Utils.leerInt();
        }
    }
    public static void invertido (int[]arr){
        for (int pos=4; pos >= 0; pos--){
            System.out.println(arr[pos]);
        }
    }


    public static void main (String[] args) {
        int[] invertir = new int[Max];
        cargaArr(invertir);
        invertido(invertir);
    }
}
