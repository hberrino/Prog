public class decero21 {
    //Hacer un programa que inserte un elemento en un arreglo
    //(ordenado decrecientemente) de tamaño MAX=10.
    public static final int Max=10;
    public static void correr_insertar (int[]arr, int n){
        int pos = 0;
        for (int j =0;j<Max;j++){
            if (arr[j]>n){
                pos=j+1;
            }
        }
        for (int i=Max-1;i>pos;i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos]=n;
    }
    public static void mostrar(int[]arr){
        for (int arreglo : arr){
            System.out.print("|"+arreglo+"|");
        }
    }
    public static void main(String[] args) {
        int[]arreglo = {10,9,8,7,6,5,4,0,0,0};
        System.out.println("ARREGLO");
        for (int arr : arreglo){
            System.out.print("|"+arr+"|");
        }
        System.out.print("\nIngrese elemento a insertar: ");
        int n = Utils.leerInt();
        correr_insertar(arreglo, n);
        mostrar(arreglo);
    }
}
