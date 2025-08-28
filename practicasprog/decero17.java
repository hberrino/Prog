public class decero17 {
    //Hacer un programa que dado un arreglo de enteros de tamaño
    //10 que se encuentra cargado, solicite al usuario un número entero
    //y lo agregue al principio del arreglo (posición 0). Para ello tendrá
    //que realizar un corrimiento a derecha (se pierde el último valor del
    //arreglo) y colocar el número en el arreglo en la posición indicada.
    public static final int Max=10;

    public static void corrimientoDer (int[]arr){
        for (int pos=Max-1;pos>0;pos--){
            arr[pos]=arr[pos-1];
        }
    }
    public static void mostrar (int[]arr){
        for(int pos =0;pos<Max;pos++){
            System.out.print(arr[pos]+"");
        }
    }
    public static void main(String[] args) {
        int[]arreglo = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("ingresa el numero a guardar en el arreglo: ");
        int n = Utils.leerInt();
        corrimientoDer(arreglo);
        arreglo[0]=n;
        mostrar(arreglo);
    }
}