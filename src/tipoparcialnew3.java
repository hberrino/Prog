public class tipoparcialnew3 {
    //duplicar vocales, e invertir nombres que empiecen con Mayus.
    //separador espacios.
    //informar cuants secuencias se encriptaron
    //4x16
    public static final int MaxC=16;
    public static final int MaxF=4;
    public static final int Separador=' ';

    public static int buscarini (char[]arr, int ini){
        while(ini<MaxC && arr[ini]==Separador){
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
    public static boolean secuenciaValida (char[]arr, int ini, int fin){
        char c=arr[ini];
        int tam = fin-ini+1;
        if (tam<2){
            return false;
        }
        if(c>='A' && c<='Z'){
            return true;
        }
        return false;
    }
    public static boolean esVocal (char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void duplicar (char[]arr, int pos){
        for(int i=MaxC-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
    }
    public static int cifrar (char[]arr, int ini, int fin){
        //primero duplicamos:
        int cantidad=0;
        int j=ini;
        while (j<=fin && j<MaxC-1){
            if(esVocal(arr[j])){
                duplicar(arr, j);
                j++;
                fin++;
                cantidad++;
            }
            j++;
        }
        //invertimos
        int i = ini, k = fin;
        while (i < k) {
            char temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }

        return cantidad;
    }
    public static int analizarEncriptado (char[]arr){
        int ini=0;int fin=-1; int encriptados=0;
        while(ini<MaxC){
            ini=buscarini(arr, fin+1);
            if(ini<MaxC){
                fin=buscarfin(arr, ini);//tenemos secuencia de letras
                if(secuenciaValida(arr, ini, fin)){
                    int cantidad=cifrar(arr, ini, fin);
                    encriptados++;
                    fin=fin+cantidad+1;
                }else ini=fin+1;
            }
        }
        return encriptados;
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
        int encriptados=0;
        for (int i=0;i<MaxF;i++){
            encriptados+=analizarEncriptado(matriz[i]);
        }
        System.out.println("se han encriptado: "+encriptados);
        System.out.println();
        mostrar(matriz);
    }
}
