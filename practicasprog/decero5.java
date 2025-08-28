public class decero5 {
    //Hacer un programa que dado un arreglo de caracteres de tamaño
    //MAX que se encuentra cargado, invierta el orden del contenido.
    public static final int Max=10;

    public static void invertir_mostrar(int[]arr){
        for(int pos=9;pos>=0;pos--){
            System.out.print(arr[pos]+" ");
        }

    }


    public static void main(String[] args) {
        int[]arreglo = {1,2,3,4,5,6,7,8,9,10};
        invertir_mostrar(arreglo);
    }
}
