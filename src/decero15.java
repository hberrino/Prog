public class decero15 {
    //Implementar un método que realice un corrimiento a derecha
    //en un arreglo ordenado de tamaño MAX=10 a partir de una
    //posición.

    public static final int Max=10;

    public static void corrimientoDer (int[]arr, int n){
        for (int pos=0;pos<Max;pos++){
            if (pos==n){
                //1,2,3,4,5,6
                for(int i=Max-1;i>=n;i--){
                    arr[i]=arr[i-1];
                }
            }
            System.out.print(arr[pos]+" ");
        }
    }

    public static void main(String[] args) {
        int[]arreglo = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("ingrese una posicion para iniciar el corrimiento derecha: ");
        int n = Utils.leerInt();
        corrimientoDer(arreglo, n);
    }
}
