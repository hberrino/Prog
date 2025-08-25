public class decero10 {
    //Hacer un programa que verifique en un arreglo si tiene al
    //menos N números primos. N debe ser ingresado por el usuario.
    //Reutilizar los métodos ya desarrollados.

    public static final int Max=10;

    public static void checkPrim (int[]arr, int n){
        int contador = 0;
        int aux = 0;
        for (int pos=0;pos<Max; pos++){
            aux = arr[pos];
            if (arr[pos]%2!=0 && arr[pos]/aux==1){
                contador++;
            }
        }
        if (contador >= n){
            System.out.println("tiene al menos "+n+" numeros primos");
            System.out.println("cantidad primos en arreglo: "+contador);
        }

    }
    public static void main(String[] args) {
        int[]arreglo = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("ingrese cantidad de numeros primos: ");
        int n = Utils.leerInt();
        checkPrim (arreglo, n);
    }
}
