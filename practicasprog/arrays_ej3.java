public class arrays_ej3 {
    //Con el mismo arreglo del ejercicio anterior informe por pantalla
    //cuantos elementos del mismo están por encima del promedio
    //calculado.
    public static final int Max=10;

    public static void main (String[] args){
        int[] arreglo = new int[Max];
        cargarArr(arreglo);
        double promedio = calcularPromedio(arreglo);
        int cont = contarMayoresAlPromedio(arreglo, promedio);
        System.out.println("El promedio es: " + promedio);
        System.out.println("Elementos mayores al promedio encontrados: " + cont);



    }

    public static void cargarArr (int[] arr){
        for (int pos = 0; pos < Max; pos++){
            System.out.println("ingrese el numero de la posicion "+(pos+1));
            arr[pos] = Utils.leerInt();
        }

    }
    public static double calcularPromedio(int[] arr) {
        int suma = 0;
        for (int pos = 0; pos < Max; pos++) {
            suma += arr[pos];
        }
        return (double) suma / Max;
    }
    public static int contarMayoresAlPromedio(int[] arr, double promedio) {
        int cont = 0;
        for (int pos = 0; pos < Max; pos++) {
            if (arr[pos] > promedio) {
                cont++;
            }
        }
        return cont;
    }
}
