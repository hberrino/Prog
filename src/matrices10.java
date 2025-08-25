public class matrices10 {
    public static final int MaxF=4;
    public static final int MaxC=20;
    //Hacer un programa que dada la matriz de secuencias de
    //enteros definida y precargada, permita obtener a través de
    //métodos la posición de inicio y la posición de fin de la secuencia
    //ubicada a partir de una posición entera y una fila, ambas
    //ingresadas por el usuario. Finalmente, si existen imprima por
    //pantalla ambas posiciones obtenidas.

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
    public static void busqueda (int[][]matriz, int posicion, int fila){
        int ini =0; int fin = -1; int lugar=0;
        while (ini<MaxC){
            ini = buscarini(matriz, fila, fin+1);
            if (ini<MaxC){
                fin=buscarfin(matriz, fila, ini);//tengo secuencia de la fila especifica
                if (seEncuentra(ini, fin, posicion)){
                        System.out.println("posicion de inicio: "+ini);
                        System.out.println("posicion de fin: "+fin);
                }else ini=fin+1;
            }
        }
    }
    public static boolean seEncuentra (int ini, int fin, int posicion){
        boolean encontrado=false;
        while (ini<=fin && !encontrado){
            if (ini==posicion){
                encontrado=true;
            }
            ini++;
        }
        return encontrado;
    }
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 3, 5, 2, 0, 7, 1, 0, 4, 6, 0, 0, 2, 3, 1, 0, 9, 8, 0, 0},
                {0, 0, 4, 3, 0, 6, 5, 2, 0, 0, 8, 1, 0, 7, 0, 9, 0, 0, 0, 0},
                {0, 1, 2, 3, 0, 0, 9, 8, 0, 0, 4, 5, 0, 6, 7, 0, 0, 0, 0, 0},
                {0, 5, 3, 0, 0, 2, 1, 0, 4, 0, 0, 7, 9, 0, 8, 0, 0, 6, 0, 0}
        };
        System.out.println("ingrese posicion a buscar: ");
        int posicion=Utils.leerInt();
        System.out.println("ingrese fila en la que buscar: ");
        int fila = Utils.leerInt();
        busqueda(matriz, posicion, fila);
    }
}