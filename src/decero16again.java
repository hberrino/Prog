public class decero16again {
    //Implementar un método que realice un corrimiento a izquierda
    //en un arreglo ordenado de tamaño MAX=10 a partir de una
    //posición.
    public static final int Max=10;

    public static void corrimientoIzq(int[]arr, int n){
        if (n>=0 && n<=Max){
            for (int pos=n;pos<Max-1;pos++){
                arr[pos]=arr[pos+1];
            }
            arr[Max-1]=arr[Max-2];
        }
    }
    public static void mostrar(int[]arr){
        for (int pos =0;pos<Max;pos++){
            System.out.print(arr[pos]+" ");
        }
    }


    public static void main(String[] args) {
        int[]arreglo = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("ingrese poss a buscar: ");
        int n = Utils.leerInt();
        corrimientoIzq(arreglo, n);
        mostrar(arreglo);
    }
}
