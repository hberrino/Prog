public class tipoparcialtry2 {
    public static final int Max = 20;
    public static final int Separador = 0;
    public static final int MaxMesas = 10;

    //dejar 0 al final del arreglo clientes, para poder ingresar nuevos.
    //asignar en el registro de clientes, a una mesa que ocupe cantidad necesaria.
    //volver el arreglo de mesa que se ocupo a negativo.
    //si se asigna se elimina de arreglo clientes corriendo izquierda.
    //si no hubo mesa disponible igual, avisar que no se pudo.
    //si no quedan mas mesas y siguen habiendo clientes, debe avisar que ya no quedan.
    public static int buscarini(int[] arr, int ini) {
        while (ini < Max && arr[ini] == Separador) {
            ini++;
        }
        return ini;
    }

    public static int buscarfin(int[] arr, int ini) {
        while (ini < Max && arr[ini] != Separador) {
            ini++;
        }
        return ini - 1;
    }

    public static int checkMesa(int cantidadclientes, int[] lugarmesa) {
        for (int i = 0; i < MaxMesas; i++) {
            if (lugarmesa[i] == cantidadclientes) {
                return i;
            }
        }
        return -1;
    }
    public static void corrimiento (int[]clientes){
        for (int i=0;i<Max-1;i++){
            clientes[i]=clientes[i+1];
            clientes[Max-1]=0;
        }
    }

    public static void procesar_secuencias(int[] clientes, int[] mesas) {
        int ini = 0, fin = -1, cantidad_mesas=MaxMesas;
        while (ini < Max) {
            ini = buscarini(clientes, ini);
            if (ini < Max) {
                fin = buscarfin(clientes, ini);
                int cantidadClientes = clientes[ini];;
                int clientestotal=fin-ini+1;
                int asignarMesa = checkMesa(cantidadClientes, mesas);
                if (asignarMesa!=-1){
                    System.out.println("se ha ocupado la mesa: "+asignarMesa);
                    mesas[asignarMesa]*=-1;
                    corrimiento(clientes);
                    clientestotal--;
                    cantidad_mesas--;
                }
                if(cantidad_mesas==0){
                    System.out.println("No hay mas mesas, espere a que se liberen!");
                    ini=Max;
                }else if (clientestotal==0){
                    System.out.println("todos los clientes han sido ubicados!");
                    ini=Max;
                }
            }
        }
    }
    public static void mostrarArreglo (int[]clientes, int[]mesas){
        for (int i =0;i<Max;i++){
            System.out.print(clientes[i]+" ");
        }
        System.out.println();
        for (int i=0;i<MaxMesas;i++){
            System.out.print(mesas[i]+" ");
        }
    }


        public static void main (String[]args) {
            int[] clientes = {4, 3, 6, 8, 12, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int[] mesas = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            procesar_secuencias(clientes, mesas);
            mostrarArreglo(clientes, mesas);
            System.out.println();
            for (int i = 0; i < Max; i++) {
                System.out.println("ASIGNAR CLIENTES A ESPERA " + (i + 1)+":");
                clientes[i] = Utils.leerInt();
            }
            procesar_secuencias(clientes, mesas);
            System.out.println();
        }
}
