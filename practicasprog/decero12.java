public class decero12 {
    //Dado dos arreglos de números enteros: un arreglo A de tamaño
    //MAXA y un arreglo B de tamaño MAXB con números entre 0 y
    //MAXA-1, determinar la suma de los elementos del arreglo A cuyas
    //posiciones son indicadas por el arreglo B. Por ejemplo, dado
    //A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
    //informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
    //y el 31 de la posición 2 del arreglo A).

    public static final int MaxA = 8;
    public static final int MaxB = 2;

    public static void suma (int[]arr1, int[]arr2){
        int suma = 0;
        for (int j=0;j<MaxB;j++){
            for (int pos=0;pos<MaxA;pos++){
                if (arr2[j]==pos){
                    suma += arr1[pos];
                }
            }
        }
        System.out.println(suma);
    }

    public static void main(String[] args) {
        int[]arregloA = {5,7,8,3,1,5,16,7};
        int[]arregloB = {6,5};
        suma(arregloA, arregloB);

    }


}
