public class arrays_ej22 {
    //Hacer un programa que elimine los valores pares en un arreglo
    //de tamaño MAX=10.
    public static final int Max = 10;

    public static void eliminarPares (int[]arr){
        int[]impares = new int[Max];
        int cant=0;
        for (int pos =0;pos<Max;pos++){
            if (arr[pos]%2 != 0) {
                impares[cant++]=arr[pos];
            }
        }
        System.out.println("ARREGLO SIN PARES");
        for (int i =0; i<cant;i++){
            System.out.print("|"+impares[i]+"|"+" ");
        }
    }
    public static void main(String[] args) {
        int[]arreglo = {20,5,3,7,2,6,33,12,94,4};
        eliminarPares(arreglo);
    }
}
