public class tipoparcialnew4 {
    //4x15
    //promedio por secuencia, y analizar si es creciente.
    //si los promedios por hora son crecientes durante 2 dias seguidos, notificar cumple.
    public static final int MaxC=15;
    public static final int MaxF=4;
    public static final int Separador=0;
    public static final int Mindias=2;
    public static int buscarini (int[]arr, int ini){
        while (ini<MaxC && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while(ini<MaxC && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static boolean analizarDia (int[]arr){
        int ini=0; int fin=-1; double promedio=0; boolean diaValido=true;
        while(ini<MaxC && diaValido){
            ini=buscarini(arr, fin+1);
            if(ini<MaxC){
                fin=buscarfin(arr, ini);
                double promediosecuencia=promediar(arr, ini, fin);
                if(promediosecuencia>=promedio){
                    promedio=promediosecuencia;
                    ini=fin+1;
                }else diaValido=false;
            }
        }
        return diaValido;
    }
    public static double promediar (int[]arr, int ini, int fin){
        int tam = fin-ini+1;
        int suma = 0;
        for(int i=ini;i<=fin;i++){
            suma+=arr[i];
        }
        return (double)suma/tam;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 625, 815, 900, 0, 562, 952, 300, 0, 365, 169, 254, 0, 0, 0},
                {0, 958, 62, 57, 221, 0, 596, 623, 600, 0, 587, 889, 984, 0, 0},
                {0, 0, 700, 257, 0, 0, 0, 854, 958, 388, 0, 954, 842, 925, 0},
                {0, 988, 899, 874, 0, 254, 258, 652, 200, 0, 568, 958, 210, 0, 0}
        };
        int contador=0;
        for(int i =0;i<MaxF;i++){
            if(analizarDia(matriz[i])){
                contador++;
                if(contador>=Mindias){
                    System.out.println("Se cumple al menos 2 dias con promedio ascendente.");
                }
            }else{
                contador=0;
            }
        }
    }
}