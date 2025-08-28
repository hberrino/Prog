public class decero3 {
    //Con el mismo arreglo del ejercicio anterior informe por pantalla
    //cuantos elementos del mismo están por encima del promedio
    //calculado.
    public static final int Max=10;

    public static void calculo_muestra (int[]arr){
        double suma = 0;
        for(int pos=0;pos<Max;pos++){
            suma+=arr[pos];
        }
        double promedio = suma/10;
        System.out.println("promedio del arreglo: "+promedio);
        for (int pos = 0;pos<Max;pos++){
            if (arr[pos]>=promedio){
                System.out.println("el numero "+arr[pos]+" encontrado en la pos "+pos+" es mayor al promedio: "+promedio);
            }
        }

    }

    public static void main(String[] args) {
        int[]arreglo = {13,2,5,3,16,14,5,4,3,11};
        calculo_muestra(arreglo);
    }



}
