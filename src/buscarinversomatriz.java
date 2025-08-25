public class buscarinversomatriz {
    //Hacer un programa que dada la matriz de secuencias de
    //caracteres definida y precargada, permita encontrar por cada fila
    //la posición de inicio y fin de la anteúltima secuencia (considerar
    //comenzar a buscarla a partir de la última posición de la fila).
    public static final int MaxF = 4;
    public static final int MaxC = 20;
    public static final char separador = ' ';
    //empezar a leer desde el final, la primer secuencia la ignoro,
    //la proxima es la q tengo q dar el inicio y fin.
    public static int buscarfin (char[]arr, int ini){
        while (ini>=0 && arr[ini]==separador){
            ini--;
        }
        return ini;
    }
    public static int buscarini (char[]arr, int ini){
        while (ini>=0 && arr[ini]!=separador){
            ini--;
        }
        return ini+1;
    }
    public static void buscarSec (char[]arr){
        int fin=MaxC-1; int ini=-1; int conteo=0;
        while (fin>=0 && conteo<2){
            fin=buscarfin(arr, fin);
            if(fin>=0){
                ini=buscarini(arr, fin);
                conteo++;
                if(conteo==2){
                    System.out.println("Anteultima Secuencia: inicio: "+ini+" | "+"fin: "+fin);
                }else fin=ini-1;
            }
        }
    }
    public static void main(String[] args) {
        char[][] matriz = {
                {' ', 'a', 'b', 'c', ' ', 'x', 'y', 'z', ' ', 'm', 'n', 'o', ' ', ' ', 'p', 'q', 'r', ' ', ' ', ' '},
                {' ', ' ', 'k', 'l', ' ', 'e', 'f', 'g', ' ', 'h', 'i', 'j', ' ', 'a', ' ', 'b', 'c', ' ', ' ', ' '},
                {' ', 'd', 'e', 'f', ' ', ' ', 'g', 'h', ' ', ' ', 'i', 'j', ' ', 'k', 'l', ' ', ' ', ' ', ' ', ' '},
                {' ', 'm', 'n', ' ', ' ', 'o', 'p', ' ', 'q', ' ', ' ', 'r', 's', ' ', 't', ' ', ' ', 'u', ' ', ' '}
        };
        for(int i=0;i<MaxF;i++){
            System.out.println("SECUENCIA FILA |"+i+"|");
            buscarSec(matriz[i]);
        }
    }
}
