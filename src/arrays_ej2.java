public class arrays_ej2 {
    //mostrar promedio de los numeros del arreglo


    public static final int Max=10;

    public static void main (String[] args){
        int[] arreglo = new int[Max];
        cargarArr(arreglo);
        promedioArr(arreglo);
    }

    public static void cargarArr (int[] arr){
        for (int pos = 0; pos < Max; pos++){
            System.out.println("ingrese el numero de la posicion "+(pos+1));
            arr[pos] = Utils.leerInt();
        }

    }
    public static void promedioArr (int[] arr){
        int suma = 0;
        for (int pos = 0; pos < Max; pos++){
            suma += arr[pos];
        }
        System.out.println("el promedio es: "+((double)suma/Max));
    }

}