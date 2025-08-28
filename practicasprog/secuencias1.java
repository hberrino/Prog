public class secuencias1 {
    //bienvenido a secuencias gordito, prepara el orto
    //Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
    //el caso de eliminar secuencias se debe hacer corrimiento.
    //23. Hacer un programa que devuelva la posición de inicio y fin de la
    //primera secuencia de números distinta de ceros.
    public static final int Max=20;
    public static int buscarini(int[]arr){
        for (int i=0;i<Max;i++){
            if (arr[i]!=0){
                return i;
            }
        }
        return -1;
    }
    public static int buscarfin (int[]arr, int ini){
        for (int i=ini;i<Max;i++){
            if (arr[i]==0){
                return i-1;
            }
        }
        return Max-1;
    }

    public static void main(String[] args) {
        int[] arrsecuencia = {0, 0, 0, 1, 2, 3, 0, 0, 4, 5, 6, 7, 8, 0, 0, 9, 10, 11, 12, 13};
        int ini = buscarini(arrsecuencia);
        int fin = -1;
        if (ini != -1){
            fin = buscarfin(arrsecuencia, ini);
        }
        System.out.println("inicio: "+ini+" "+"final: "+fin);
    }
}
