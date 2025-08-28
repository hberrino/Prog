public class matrizparcial3 {
    //4x16
    public static final int MaxC=16;
    public static final int MaxF=4;
    public static char Separador=' ';

    public static int buscarini (char[][]matriz, int fila, int ini){
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
    //si arranca en mayuscula, dar vuelta la secuencia y duplicar vocales.
    //informar cantidad de secuencias que se cambiaron.
    public static void analizarmatriz (char[][]matriz){
        int secuenciasCifradas=0;
        for (int i=0;i<MaxF;i++){
            int ini =0;int fin=-1;
            while (ini<MaxC){
                ini=buscarini(matriz, i, fin+1);
                if(ini<MaxC){
                    fin=buscarfin(matriz, i, ini);
                    int tam = fin-ini+1;
                    if (esMayus(matriz, i, ini) && tam>=2){
                        secuenciasCifradas++;
                        invertir(matriz, i, ini, fin);
                        int contador=modificarSecuencia(matriz, i, ini, fin);
                        ini=fin+contador+1;
                    }else ini=fin+1;
                }
            }
        }
        System.out.println("cantidad de secuencias cifradas: "+secuenciasCifradas);
    }
    public static int modificarSecuencia(char[][] matriz, int fila, int ini, int fin) {
        int contador = 0;
        int i =ini;
        while (i<=fin && fin<MaxC-1) {
            if (esVocal(matriz, fila, i)) {
                duplicar_insertar(matriz, fila, i);
                contador++;
                i++;
                fin++;
            }
            i++;
        }
        return contador;
    }
    public static void invertir (char[][]matriz, int fila, int ini, int fin){
        while (ini < fin) {
            char temp = matriz[fila][ini];
            matriz[fila][ini] = matriz[fila][fin];
            matriz[fila][fin] = temp;
            ini++;
            fin--;
        }
    }
    public static void duplicar_insertar (char[][]matriz, int fila, int pos){
        for(int i =MaxC-1;i>pos;i--){
            matriz[fila][i]=matriz[fila][i-1];
        }
        matriz[fila][pos+1] = matriz[fila][pos];
    }
    public static boolean esVocal (char[][]matriz, int fila, int ini){
        char c = matriz[fila][ini];
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static boolean esMayus (char[][]matriz, int fila, int ini ){
        char c = matriz[fila][ini];
        return c <= 'Z' && c >= 'A';
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
                {' ', 'e', 'l', ' ', 'A', 'g', 'e', 'n', 't', 'e', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', 'J', 'a', 'm', 'e', 's', ' ', 'B', 'o', ' ', 's', 'e', ' ', ' ', ' ', ' '},
                {' ', 'e', 'n', 'c', 'u', 'e', 'n', 't', 'r', 'a', ' ', 'e', 'n', ' ', ' ', ' '},
                {' ', 'C', 'o', 'l', 'o', 'n', 'i', 'a', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
        analizarmatriz(matriz);
        mostrar(matriz);
    }
}
