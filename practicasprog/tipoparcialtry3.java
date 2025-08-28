public class tipoparcialtry3 {
    public static final int Max=28;
    public static final int Reg=2;
    public static final int Separador=0;
    public static int buscarini(int[]arr, int ini){
        while (ini<Max && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while (ini<Max && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static void procesar_secuencias (int[]productos, int[]regalos){
        int ini =0, fin = -1;
        while (ini<Max){
            ini=buscarini(productos, ini);
                if(ini<Max){
                    fin=buscarfin(productos, ini);
                    insertar(productos, ini, fin, regalos);
                }
                ini=fin+1;
        }
    }
    public static void insertar(int[] productos, int ini, int fin, int[] regalos) {
        for (int i = 0; i < Reg; i++) {
            boolean insertado = false;

            for (int j = ini; j <= fin; j++) {
                if (regalos[i] <= productos[j]) {
                    if (productos[Max - 1] != Separador) {
                        System.out.println("Error: no hay espacio para insertar regalo " + regalos[i]);
                        return;
                    }
                    // Corrimiento a derecha
                    for (int h = Max - 1; h > j; h--) {
                        productos[h] = productos[h - 1];
                    }
                    productos[j] = regalos[i];
                    fin++;  // actualizar fin porque insertamos
                    insertado = true;
                    break;
                }
            }

            if (!insertado) {
                if (productos[Max - 1] != Separador) {
                    System.out.println("Error: no hay espacio para insertar regalo " + regalos[i]);
                    return;
                }
                // Insertar al final de la secuencia
                for (int h = Max - 1; h > fin + 1; h--) {
                    productos[h] = productos[h - 1];
                }
                productos[fin + 1] = regalos[i];
                fin++;
            }
        }
    }
    public static void mostrarArr (int[]productos){
        for (int i=0;i<Max;i++){
            System.out.print(productos[i]+" ");
        }
    }
    //insertar regalos de pos 0, y 1, en secuencias entre ini y fin, de forma creciente y ordenada.
    public static void main(String[] args) {
        int[]productos = {0,0,9,12,18,0,1,5,43,73,88,0,8,9,52,0,1,10,90,0,0,0,0,0,0,0,0,0};
        int[]regalos = {6,44};
        procesar_secuencias(productos, regalos);
        mostrarArr(productos);
    }
}
