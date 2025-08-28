public class comprimirsecuencia2 {
    public static final int Max=20;
    public static final int Separador=0;


    public static int buscarini(int[]arr, int ini){
        while (ini<Max && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while (ini<Max && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static void eliminar_secuencia(int[]arr, int ini, int fin){
        int i =ini;
        while (i<=fin){
            corrimiento(arr, ini);
            i++;
        }
    }
    public static void corrimiento (int[]arr, int ini){
        int i = ini;
        while (i<Max-1){
            arr[i]=arr[i+1];
            i++;
        }
    }
    public static void procesar_arreglo (int[]arr){
        int ini=0;
        int fin = -1;
        while (ini<Max){
            ini = buscarini(arr, ini);
            if (ini<Max){
                fin=buscarfin(arr,ini);
                eliminar_secuencia(arr, ini, fin);
            }ini=Max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 45, 45, 45, 45, 45, 0, 0, 15, 0, 21, 21, 21, 21, 0, 7, 8, 0, 0};
        procesar_arreglo(arr);
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }
    }
}