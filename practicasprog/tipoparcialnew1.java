public class tipoparcialnew1 {
    //buenas o malezas son mayusculas.
    //3x20
    //separador x
    //si hay mas de R mayus seguidas se activa, sino no.
    public static final int MaxC=20;
    public static final int MaxF=3;
    public static final int maxB=3;
    public static final int minR=2;
    public static final char Separador='x';

    public static int buscarini (char[]arr, int ini){
        while (ini<MaxC && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (char[]arr, int ini){
        while(ini<MaxC && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static boolean hayRepeticion (char[]arr, int ini, int fin){
        int consecutivo=0;
        while (ini<=fin){
            if (arr[ini]>='A' && arr[ini]<='Z'){
                consecutivo++;
                if (consecutivo>=minR){
                    return true;
                }
            }else consecutivo=0;
            ini++;
        }
        return false;
    }
    public static boolean esMaleza (char c, char[]buenas){
        if (c>='a' && c<='z'){
            return false; //no es maleza.
        }else if (c>='A' && c<='Z'){
            for(int i = 0;i<maxB;i++){
                if(c==buenas[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int eliminarMalezas(char[] arr, int ini, int fin, char[] buenas) {
        int eliminadas = 0;
        int i = ini;
        while (i <= fin) {
            if (esMaleza(arr[i], buenas)) {
                correr(arr, i);
                eliminadas++;
                fin--; // reduce límite porque el array se achica
            } else {
                i++; // solo avanzo si NO eliminé
            }
        }
        return eliminadas;
    }
    public static void correr (char[]arr, int pos){
        for (int i=pos;i<MaxC-1;i++){
            arr[i]=arr[i+1];
        }
    }
    public static int procesarfila (char[]arr, char[]buenas){
        int ini=0; int fin =-1; int eliminadasTotal=0;
        while (ini<MaxC){
            ini=buscarini(arr, fin+1);
            if(ini<MaxC){
                fin=buscarfin(arr, ini);
                if (hayRepeticion(arr, ini, fin)){
                    eliminadasTotal+=eliminarMalezas(arr, ini, fin, buenas);
                }
            }
        }
        return eliminadasTotal;
    }
    public static void mostrar(char[][] matriz) {
        for (int i = 0; i < MaxF; i++) {
            for (int j = 0; j < MaxC; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    //eliminar de la fila, si es que hay 2 seguidas al menos, las mayus q no sean de arr buenas
    public static void main(String[] args) {
        char[][] matriz = {
                {'x', 't', 'a', 'C', 'M', 'O', 't', 'a', 'a', 't', 'O', 'C', 't', 'P', 'a', 'O', 'M', 'C', 't', 'x'},
                {'x', 'r', 'r', 'r', 'C', 'C', 'O', 'O', 'r', 'r', 'C', 'r', 'G', 'G', 'G', 'r', 'r', 'x', 'x', 'x'},
                {'x', 'm', 'G', 'P', 'h', 'h', 'L', 'G', 'G', 'O', 'h', 'h', 'm', 'm', 'O', 'B', 'M', 'C', 'x', 'x'}
        };
        char[] buenas = {'C', 'O', 'P'};
        int eliminadastotal=0;
        for (int i=0;i<MaxF;i++){
            eliminadastotal+=procesarfila(matriz[i], buenas);
        }
        System.out.println("Eliminadas total: "+eliminadastotal);
        mostrar(matriz);
    }
}
