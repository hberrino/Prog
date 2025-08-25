public class comprimirsecuencia {
    public static final int Max=20;
    public static final int Separador=0;
    public static int buscarini(int[]arr, int ini){
        while (ini<Max && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin(int[]arr, int ini){
        while (ini<Max && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static void corrimiento (int[]arr){
        int ini =0;
        int fin =-1;
        while (ini<Max){
            ini=buscarini(arr, ini);
            if (ini<=Max) {
                fin = buscarfin(arr, ini);
                eliminarSecuencia(arr, ini, fin);
            }
            ini=fin+1;
        }
    }
    public static void eliminarSecuencia(int[] arr, int ini,int fin){
        int i=ini;
        while (i<=fin){
            correrIzquierda(arr,ini);
            i++;
        }
    }
    public static void correrIzquierda(int[] arr, int pos){
        while (pos<Max-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 45, 45, 45, 45, 45, 0, 0, 15, 0, 21, 21, 21, 21, 0, 7, 8, 0, 0};
        corrimiento(arr);
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }
    }
}
