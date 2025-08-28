public class arrays_ej7 {
    //Hacer un programa que dado un arreglo de enteros y un número
    //N, genere un arreglo con las posiciones donde se encuentra dicho
    //número. A continuación, multiplicar por un número M todas las
    //ocurrencias del número N en el arreglo original.
    public static final int Max=10;

    public static void cargaArr (int[]arr){
        for (int pos = 0; pos < Max; pos++){
            System.out.println("Ingrese un numero entero a cargar: ");
            arr[pos]=Utils.leerInt();
        }
    }
    public static void comparacion (int[]arr, int n, int m){
        for (int pos = 0;pos < Max; pos++){
            if (arr[pos]==n){
                arr[pos]=arr[pos]*m;
                System.out.println("el resultado es: "+arr[pos]+" y ahora se encuentra en la posicion: "+pos);
            }
        }
    }
    public static void main (String[] args){
        int[] arreglo = new int[Max];
        int n=0;
        int m=0;
        cargaArr(arreglo);
        System.out.println("Cargue el numero a buscar: ");
        n = Utils.leerInt();
        System.out.println("Cargue el multiplicador: ");
        m = Utils.leerInt();
        comparacion(arreglo, n, m);

    }

}
