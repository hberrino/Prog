public class secuencias4 {
    //Hacer un programa que devuelva la posición de inicio y de fin
    //de la secuencia de mayor tamaño
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
        int ini = 0, fin = -1, maspos=0, mejorini=0, mejorfin=0;
        while (ini < Max) {
            int posiciones=0;
            ini = obtenerIni(arr, ini);
            if (ini < Max) {
                fin = obtenerfin(arr, ini);
                for (int i = ini; i <= fin; i++) {
                    posiciones++;
                }
                if (maspos<posiciones) {
                    maspos = posiciones;
                    mejorini = ini;
                    mejorfin = fin;
                }else if (maspos==posiciones){
                    mejorini = ini;
                    mejorfin = fin;
                    System.out.println("hay mas de una igual en cantidad de pos");
                }

            }
            ini=fin+1;
        }
        System.out.println(maspos+" inicio: "+mejorini+" "+"fin: "+mejorfin);
    }


    public static void main (String[]args){
        int[] arrsecuencia = {0, 0, 10, 22, 2, 3, 0, 6, 13, 12, 6, 7, 0, 0, 0, 9, 10, 11, 12, 13};
        procesar_secuencia(arrsecuencia);
    }
}
