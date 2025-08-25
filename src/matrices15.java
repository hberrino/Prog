public class matrices15 {
    //Hacer un programa que dada la matriz de secuencias de
    //caracteres definida y precargada elimine todas las secuencias que
    //tienen orden descendente entre sus elementos.
    public static final int MaxF=4;
    public static final int MaxC=20;
    public static final int Separador=' ';
    public static int buscarini (char[][]matriz, int fila, int ini){
        while(ini<MaxC && matriz[fila][ini]==Separador){
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
    public static void buscarsecuencias (char[][]matriz){
        for (int i=0;i<MaxF;i++){
            int ini=0; int fin = -1;
            while (ini<MaxC){
                ini=buscarini(matriz, i, fin+1);
                if(ini<MaxC){
                    fin=buscarfin(matriz, i, ini);
                    if(esDescendente(matriz, i, ini, fin)){
                        eliminarsecuencia(matriz, i, ini, fin);
                        fin=ini-1;
                    }else ini=fin+1;
                }
            }
            ini=0;fin=-1;
        }
    }
    public static boolean esDescendente(char[][] matriz, int fila, int ini, int fin) {
        while (ini < fin && matriz[fila][ini] >= matriz[fila][ini + 1]) {
            ini++;
        }
        return ini == fin;
    }
    public static void mostrar(char[][] matriz) {
        for (int i = 0; i < MaxF; i++) {
            for (int j = 0; j < MaxC; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void eliminarsecuencia (char[][]matriz, int fila, int ini, int fin){
        for (int i =ini;i<=fin;i++){
            correr(matriz, fila, ini);
        }
    }
    public static void correr (char[][]matriz, int fila, int ini){
        for(int i=ini;i<MaxC-1;i++){
            matriz[fila][i]=matriz[fila][i+1];
        }
    }
    public static void main(String[] args) {
        char[][] matriz = {
                    {' ', 'c', 'b', 'a', ' ', 'x', 'y', 'z', ' ', 'm', 'n', 'o', ' ', ' ', 'p', 'q', 'r', ' ', ' ', ' '},
                    {' ', ' ', 'k', 'l', ' ', 'e', 'f', 'g', ' ', 'h', 'i', 'j', ' ', 'a', ' ', 'b', 'c', ' ', ' ', ' '},
                    {' ', 'd', 'e', 'f', ' ', ' ', 'g', 'h', ' ', ' ', 'i', 'j', ' ', 'k', 'l', ' ', ' ', ' ', ' ', ' '},
                    {' ', 'm', 'n', ' ', ' ', 'o', 'p', ' ', 'q', ' ', ' ', 'r', 's', ' ', 't', ' ', ' ', 'u', ' ', ' '}
        };
        buscarsecuencias(matriz);
        mostrar(matriz);
    }
}
