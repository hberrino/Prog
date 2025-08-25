public class arrays_ej11 {
    //Dado dos arreglos de números enteros A y B determinar si
    //todos los números almacenados en el arreglo A están presentes
    //en el arreglo B.
    public static final int Max=10;

    public static void cargarArrs(int[]arr){
        for(int pos=0;pos<Max;pos++){
            System.out.println("numero a cargar en la posicion "+(pos+1)+":");
            arr[pos] = Utils.leerInt();
        }
    }

    public static void compararArr(int[]arra, int[]arrb) {
        int contador = 0;
        for (int pos = 0; pos < Max; pos++) {
            for (int i = 0; i < Max; i++) {
                if (arra[pos] == arrb[i]) {
                    contador++;
                }
            }
        }
        if (contador == Max) {
            System.out.println("enteros del A son mismos que enteros del B");
        }
    }

    public static void main(String[] args) {
        int[] Arr_A = new int[Max];
        int[] Arr_B = new int[Max];
        cargarArrs(Arr_A);
        cargarArrs(Arr_B);
        compararArr(Arr_A, Arr_B);
    }
}
