public class arrays_ej12 {
   //Dado dos arreglos de números enteros: un arreglo A de tamaño
    //MAXA y un arreglo B de tamaño MAXB con números entre 0 y
    //MAXA-1, determinar la suma de los elementos del arreglo A cuyas
    //posiciones son indicadas por el arreglo B. Por ejemplo, dado
    //A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
    //informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
    //y el 31 de la posición 2 del arreglo A).
    public static final int Max=5;

    public static void sumas (int[]arrB, int[]arrA) {
        int suma = 0;
        for (int i = 0; i < 2; i++) {
            for (int pos=0;pos<Max;pos++){
                if (arrB[i]==pos){
                    suma+=arrA[pos];
                }
            }
        }
        System.out.println("la suma de las posiciones es: "+suma);
    }



    public static void main(String[] args) {
        int[] arregloB = {3,0};
        int[] arregloA = {2,14,54,67,8,4};
        sumas(arregloB, arregloA);

    }
}
