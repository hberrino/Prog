public class secuencias2 {
    //Hacer un programa que devuelva la posición de inicio y fin de la
    //secuencia de números distintos de ceros cuya suma del contenido
    //sea mayor.
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

        public static void procesar_secuencia ( int[] arr) {
            int ini = 0, fin = -1, mejorsuma=0, mejorini=0, mejorfin=0;
            while (ini < Max) {
                int suma=0;
                ini = obtenerIni(arr, ini);
                if (ini < 0) {
                    fin = obtenerfin(arr, ini);
                    for (int i = ini; i <= fin; i++) {
                        suma += arr[i];
                    }
                    if (mejorsuma<suma){
                        mejorsuma=suma;
                        mejorini=ini;
                        mejorfin=fin;
                    }
                }
                ini=fin+1;
            }
            System.out.println(mejorsuma+" inicio: "+mejorini+" "+"fin: "+mejorfin);
        }


        public static void main (String[]args){
            int[] arrsecuencia = {0, 0, 10, 22, 2, 3, 0, 0, 13, 12, 6, 7, 8, 0, 0, 9, 10, 11, 12, 13};
            procesar_secuencia(arrsecuencia);
        }
}
