public class matrices14 {
    //Hacer un programa que dada la matriz de secuencias de
    //caracteres definida y precargada, elimine de cada fila todas las
    //ocurrencias de una secuencia patrón dada por un arreglo de
    //caracteres de tamaño igual al tamaño de columnas de la matriz
    //(sólo tiene esa secuencia con separadores al inicio y al final). Al
    //eliminar en cada fila se pierden los valores haciendo los
    //corrimientos.
    public static final int MaxF=4;
    public static final int MaxC=20;
    public static final int Separador=' ';

    public static int buscarini(char[][]matriz, int fila, int ini){
        while (ini<MaxC && matriz[fila][ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (char[][]matriz, int fila, int ini){
        while (ini<MaxC && matriz[fila][ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static int buscarini2(char[]patron, int ini){
        while (ini<MaxC && patron[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin2 (char[]patron, int ini){
        while (ini<MaxC && patron[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static void buscarpatron(char[][]matriz, char[]patron){
        int ini2=0; int fin2=-1;
        while (ini2<MaxC) {
            ini2 = buscarini2(patron, fin2 + 1);
            if (ini2 < MaxC) {
                fin2 = buscarfin2(patron, ini2);
                for (int i =0;i<MaxF;i++){
                    int ini=0;int fin=-1;
                    while(ini<MaxC){
                        ini=buscarini(matriz, i, fin+1);
                        if (ini<MaxC){
                            fin=buscarfin(matriz, i, ini);
                            if(comparar(patron, ini2, fin2, matriz, i, ini, fin)){
                                eliminarsecuencia(matriz,i,ini,fin);
                                fin=ini-1;
                            }else ini=fin+1;
                        }
                    }
                    ini=0;fin=-1;
                }
            }
        }
    }
    public static boolean comparar (char[]patron, int ini2, int fin2, char[][]matriz, int fila, int ini, int fin) {
        int tampatron = fin2 - ini2 + 1;
        int tamsecuencia = fin - ini + 1;
        if (tampatron != tamsecuencia) {
            return false;
        } else if (patron[ini2] != matriz[fila][ini]) {
            return false;
        } else if (patron[fin2] != matriz[fila][fin]) {
            return false;
        }
        for (int i = 0; i < tampatron; i++) {
            if (patron[ini2 + i] != matriz[fila][ini + i]) {
                return false;
            }
        }
        return true;
    }
    public static void eliminarsecuencia (char[][]matriz, int fila, int ini, int fin){
        for(int i=ini;i<=fin;i++){
            correr(matriz,fila,ini);
        }
    }
    public static void correr (char[][]matriz, int fila, int ini){
        for (int i=ini;i<MaxC-1;i++){
            matriz[fila][i]=matriz[fila][i+1];
        }
    }
    public static void mostrar(char[][] matriz) {
        for (int i = 0; i < MaxF; i++) {
            for (int j = 0; j < MaxC; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] matriz = {
                {' ', 'a', 'b', 'c', ' ', 'x', 'y', 'z', ' ', 'm', 'n', 'o', ' ', ' ', 'p', 'q', 'r', ' ', ' ', ' '},
                {' ', ' ', 'k', 'l', ' ', 'e', 'f', 'g', ' ', 'h', 'i', 'j', ' ', 'a', ' ', 'b', 'c', ' ', ' ', ' '},
                {' ', 'd', 'e', 'f', ' ', ' ', 'g', 'h', ' ', ' ', 'i', 'j', ' ', 'k', 'l', ' ', ' ', ' ', ' ', ' '},
                {' ', 'm', 'n', ' ', ' ', 'o', 'p', ' ', 'q', ' ', ' ', 'r', 's', ' ', 't', ' ', ' ', 'u', ' ', ' '}
        };
        char[] patron = {' ', ' ', ' ', ' ', ' ', 'm', 'n', 'o', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        buscarpatron(matriz, patron);
        mostrar(matriz);
    }
}
