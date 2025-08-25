public class decero7 {
    //Hacer un programa que dado un arreglo de enteros y un número
    //N, genere un arreglo con las posiciones donde se encuentra dicho
    //número. A continuación, multiplicar por un número M todas las
    //ocurrencias del número N en el arreglo original.


    public static final int Max=10;


    public static void busqueda_nuevo_muestra(int[]arr, int n, int m){
        int iterador=0;
        int cantidad=0;
        for (int pos=0;pos<Max;pos++){
            if (arr[pos]==n){
                cantidad++;
            }
        }
        int[]arreglonuevo = new int [cantidad];
        System.out.println("ARREGLO MODIFICADO POR EL MULTIPLICADOR: "+m);
        for (int pos = 0; pos<Max; pos++){
            if (arr[pos]==n){
                arreglonuevo[iterador]=pos;
                iterador++;
                arr[pos]=arr[pos]*m;
            }
            System.out.print(arr[pos]+" ");
        }
        System.out.println("\nARREGLO CON POSICIONES ENCONTRADAS: ");
        for (int i=0;i<cantidad;i++){
            System.out.print(arreglonuevo[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arreglo = {2,3,2,6,7,2,4,6,2,2};
        System.out.println("ingrese un numero a buscar: ");
        int n = Utils.leerInt();
        System.out.println("ingrese multiplicador: ");
        int m = Utils.leerInt();
        busqueda_nuevo_muestra(arreglo, n, m);
    }
}
