public class arraysrepaso1 {
    public static final int Max=10;
    //Hacer un programa que dado un arreglo ya cargado con 10
    //enteros, calcule el promedio y lo muestre por la consola.


    public static void promedio (int[]arr){
        int suma=0;
        for (int pos =0;pos<Max;pos++){
            suma += arr[pos];
        }
        System.out.println("el promedio es: "+(double)suma/10);
    }



    public static void main(String[] args) {
        int[]arreglo = {4,5,8,3,2,8,9,3,23,2};
        promedio(arreglo);
    }
}
