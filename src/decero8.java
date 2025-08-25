public class decero8 {
    //Hacer un programa que determine si los valores almacenados en
    //un arreglo de enteros se encuentran en orden ascendente.

    public static final int Max=10;
    public static boolean checkAsc (int[]arr){
        int contador = 0;
        for(int pos=0;pos<Max-1;pos++) {
            if (arr[pos] < arr[pos+1]) {
                contador++;
            }
            if (contador==Max-1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]arregloAsc = {1,2,3,4,5,6,7,8,9,10};
        if (checkAsc(arregloAsc)){
            System.out.println("es ascendente");
        }else
            System.out.println("no es ascendente");
    }
}
