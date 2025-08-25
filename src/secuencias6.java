public class secuencias6 {
    //Hacer un programa que elimine de un arreglo todas las
    //ocurrencias de una secuencia patrón dada por otro arreglo.
    public static final int Max = 20;
    public static final int Maxpatron=2;
    public static int buscarini(int[]arr, int ini){
        while(ini<Max && arr[ini]==0){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while (ini<Max && arr[ini]!=0){
            ini++;
        }
        return ini-1;
    }
    public static void procesar_secuencia (int[]arr, int[]patron){
        int ini=0; int fin = -1;
        while (ini<Max){
            ini=buscarini(arr, ini);
            if (ini<Max){
                fin=buscarfin(arr, ini);
                int tamaño = fin-ini+1;
                int pos=buscarPatron(arr, ini, fin, patron);
                if (pos!=-1){
                    eliminarDesde(arr, pos, tamaño);
                }
            }
        }
    }
    public static void eliminarDesde(int[] arr, int pos, int largo) {
        for (int i = pos + largo; i < Max; i++) {
            arr[i - largo] = arr[i];
        }
        // Rellenamos el final con ceros
        for (int i = Max - largo; i < Max; i++) {
            arr[i] = 0;
        }
    }
    public static int buscarPatron (int[]arr, int ini, int fin, int[]patron){
        for (int i=ini; i<= fin-Maxpatron-1;i++){
            boolean coincide = true;
            for (int j=0;j<Maxpatron;j++){
                if (arr[i+j]!=patron[j]){
                    coincide = false;
                    j = Maxpatron;
                }
                if (coincide) return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arrsecuencia = {0, 0, 10, 22, 2, 3, 0, 6, 13, 12, 6, 7, 0, 0, 0, 9, 10, 11, 12, 13};
        int[] patronsecuencia = {13, 12};
        procesar_secuencia(arrsecuencia, patronsecuencia);
        for (int arreglo : arrsecuencia){
            System.out.print(arreglo+" ");
        }
    }
}