public class decero2 {
    //Hacer un programa que dado un arreglo ya cargado con 10
    //enteros, calcule el promedio y lo muestre por la consola.
    public static final int Max=10;

    public static void calculo_muestra (int[]arr){
        double suma = 0;
        for(int pos=0;pos<Max;pos++){
            suma+=arr[pos];
        }
        System.out.println("promedio del arreglo: "+(suma/10));
    }

    public static void main(String[] args) {
        int[]arreglo = {13,2,5,3,16,14,5,4,3,11};
        calculo_muestra(arreglo);
    }
}
