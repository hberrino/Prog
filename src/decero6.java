public class decero6 {
    //Hacer un programa que dado un arreglo de enteros de tamaño 10
    //que se encuentra cargado, obtenga la cantidad de números pares
    //que tiene y la imprima
    public static final int Max=10;

    public static void buscarPares_imprimir(int[]arr){
        for(int pos = 0; pos<Max;pos++){
            if (arr[pos]%2==0){
                System.out.println("numero "+arr[pos]+" de la posicion "+pos+" es par");
            }
        }
    }

    public static void main(String[] args) {
        int[]arreglo = {1,5,23,6,7,3,6,8,54,22};
        buscarPares_imprimir(arreglo);
    }
}
