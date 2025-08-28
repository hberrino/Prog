import java.sql.SQLOutput;

public class secuencias5 {
    //Hacer un programa que dado un número N ingresado por el
    //usuario, elimine las secuencias de tamaño N de números distintos
    //de cero
    public static final int Max = 20;

    public static int obtenerIni(int[] arr, int ini) {
        while (ini < Max && arr[ini] == 0) {
            ini++;
        }
        return ini;
    }
    public static int obtenerfin (int[]arr, int ini) {
        while (ini<Max && arr[ini]!=0) {
            ini++;
        }
        return ini-1;
    }

    public static void procesar_secuencia ( int[] arr, int n) {
        int ini = 0, fin = -1, cantidad = 0;
        while (ini<Max){
            ini = obtenerIni(arr, ini);
            if (ini<Max){
                cantidad=0;
                fin = obtenerfin(arr, ini);
                int i = ini;
                while (i<=fin){
                    i++;
                    cantidad++;
                }
            }
            if(cantidad==n){
                int i=ini;
                while (i<=fin){
                    arr[i]=0;
                    i++;
                }
            }else
                ini = fin+1;
        }
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }
    }

    public static void main (String[]args){
        int[] arrsecuencia = {0, 0, 10, 22, 0, 0, 0, 6, 13, 12, 6, 7, 0, 0, 0, 9, 10, 11, 12, 13};
        System.out.println("se elimina secuencia de cantidad: ");
        int n = Utils.leerInt();
        procesar_secuencia(arrsecuencia, n);
    }
}
