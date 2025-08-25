public class matrices11 {
    //Hacer un programa que dada la matriz de secuencias de
    //enteros definida y precargada permita encontrar por cada fila la
    //posición de inicio y fin de la secuencia cuya suma de valores sea
    //mayor
    public static final int MaxF=4;
    public static final int MaxC=20;
    public static int buscarini (int[][]matriz, int fila, int pos){
        while (pos<MaxC && matriz[fila][pos]==0){
            pos++;
        }
        return pos;
    }
    public static int buscarfin (int[][]matriz, int fila, int pos){
        while (pos<MaxC && matriz[fila][pos]!=0){
            pos++;
        }
        return pos-1;
    }
    public static void procesar_matriz (int[][]matriz){
        int ini = 0; int fin= -1; int mejorsumaxfila=0; int mejorini=0; int mejorfin=0;
        for (int i = 0;i<MaxF;i++){
            while (ini<MaxC){
                ini=buscarini(matriz, i, fin+1);
                if (ini<MaxC){
                    fin=buscarfin(matriz, i, ini);
                    int sumasecuencia=suma(matriz, i, ini, fin);
                    if (mejorsumaxfila<sumasecuencia){
                        mejorsumaxfila=sumasecuencia;
                        mejorini=ini;
                        mejorfin=fin;
                    }
                    ini=fin+1;
                }
            }
            System.out.println("mayor suma de fila:"+mejorsumaxfila+"\nmejor inicio: "+mejorini+" | mejor fin: "+mejorfin);
            mejorsumaxfila=0;
            mejorini=0;
            mejorfin=0;
            ini=0;
            fin=-1;
        }

    }
    public static int suma (int[][]matriz, int fila, int ini, int fin){
        int suma=0;
        for (int i=ini;i<=fin;i++){
            suma+=matriz[fila][i];
        }
        return suma;
    }
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 3, 5, 2, 0, 7, 1, 0, 4, 6, 0, 0, 2, 3, 1, 0, 9, 8, 0, 0},
                {0, 0, 4, 3, 0, 6, 5, 2, 0, 0, 8, 1, 0, 7, 0, 9, 0, 0, 0, 0},
                {0, 1, 2, 3, 0, 0, 9, 8, 0, 0, 4, 5, 0, 6, 7, 0, 0, 0, 0, 0},
                {0, 5, 3, 0, 0, 2, 1, 0, 4, 0, 0, 7, 9, 0, 8, 0, 0, 6, 0, 0}
        };
        procesar_matriz(matriz);
    }
}
