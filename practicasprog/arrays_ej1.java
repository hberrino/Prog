public class arrays_ej1 {
    //Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
    //de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
    public static final int MAX = 15;


    public static void main (String[] args){
        int[] arreglo = new int[MAX];
        cargarArreglo(arreglo);
        mostrarArreglo(arreglo);



    }

    public static void cargarArreglo(int[] arrenteros){
        for (int pos = 0; pos < MAX; pos++){
            System.out.println ("Ingrese el entero de la posición " + pos + ": ");
            arrenteros[pos] = Utils.leerInt();
        }

    }

    public static void mostrarArreglo(int[] arrenteros){
        for (int pos = 0; pos < MAX; pos++){
                System.out.println("arrenteros["+pos+"] -> "+arrenteros[pos]);
        }

    }



}
