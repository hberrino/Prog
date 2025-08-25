public class tipoparcialtry {
    public static final int Max=20;
    public static final int MaxA=3;
    public static final int Separador=0;

    public static int buscarini (int[]arr,int ini){
        while (ini<Max && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr,int ini){
        while (ini<Max && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static int checkearAula (int[]arrAulas, int cantidad){
        for (int i=0;i<MaxA;i++){
            if (arrAulas[i]==cantidad){
                return i;
            }
        }
        return -1;
    }
    public static void Asignar (int[]arr, int pos){
        int num=arr[pos];
        arr[pos]=-num;
    }
    public static void corrimiento (int[]arr,int ini, int cantidad){
        for (int i = ini; i<Max-cantidad; i++){
            arr[i]=arr[i+cantidad];
        }
        for (int i = Max-cantidad; i<Max;i++) {
            arr[i]=Separador;
        }
    }
    public static void procesar_secuencias (int[]arr, int[]arrAulas){
        int cantidadAulas = 0;
        int ini=0;
        int fin=-1;
        while (ini<Max) {
            ini = buscarini(arr, ini);
            if (ini < Max) {
                fin = buscarfin(arr, ini);
                int cantidad = fin - ini + 1;//tenemos la cantidad de alumnos en secuencia.
                int numAula = checkearAula(arrAulas, cantidad);
                if (numAula != -1) {
                    Asignar(arrAulas, numAula);//tengo q volver esa pos negativa
                    System.out.println("se ha asignado correctamente la cantidad: "+cantidad+" al aula!");
                    corrimiento(arr, ini, cantidad); //tengo que eliminar esos alumnos
                    System.out.println("Se elimina secuencia de alumnos");
                    cantidadAulas++;
                }else if (cantidadAulas==MaxA) {
                    ini = Max;
                    System.out.println("Sin espacio");
                }
                else
                    ini=fin+1;
            }
        }
    }
    //long de la secuencia es igual a arregloaulas que debe ingresarse, si coincide
    //corrimiento en arreglo origina para eliminar, y en arreglo aulas esa pos la vuevo negativa.
    public static void main(String[] args) {
        int[]arreglo = {0,0,34,2,12,0,0,32,55,12,3,88,14,0,86,17,36,19,0,0};
        int[]arregloAulas = {4,3,6};
        procesar_secuencias(arreglo, arregloAulas);
        for (int arr : arreglo){
            System.out.print(arr+" ");
        }
        System.out.println();
        for (int arr2 : arregloAulas){
            System.out.print(arr2+" ");
        }
    }
}