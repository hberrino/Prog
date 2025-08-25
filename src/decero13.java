public class decero13 {
    //Dado un arreglo de caracteres de tamaño MAX, hacer un
    //programa que implemente métodos tal que devuelva al main dos
    //arreglos: un arreglo con los caracteres que son letras vocales y
    //otro con los que son consonantes.


    public static final int Max=10;

    public static boolean esVocal (char[]arr, char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public static int cantidad(char[] arr) {
        int contador_vocales = 0;
        for (int pos = 0; pos < Max; pos++) {
            if (esVocal(arr, arr[pos])) {
                contador_vocales++;
            }
        }
        return contador_vocales;
    }
    public static void mostrar (char[]arr1, char[]arr2){
        System.out.println("ARREGLO VOCALES");
        for(int pos=0;pos< arr1.length;pos++){
            System.out.print(arr1[pos]+" ");
        }
        System.out.println("\nSARREGLO CONSONANTES");
        for (int pos=0;pos<arr2.length;pos++){
            System.out.print(arr2[pos]+" ");
        }
    }
    public static void asignarArrs (char[]arrMix, char[]arr1, char[]arr2){
        int iterador=0;
        int iterador2=0;
        for (int pos = 0;pos<Max; pos++){
            if (esVocal(arrMix, arrMix[pos])){
                arr1[iterador++]=arrMix[pos];
            }else
                arr2[iterador2++]=arrMix[pos];
        }
    }
    public static void main(String[] args) {
        char[]arregloMix = {'a','z','x','b','e','u','d','o','f','i'};
        int cantidad_vocales = cantidad(arregloMix);
        int cantidad_consonantes = Max-cantidad_vocales;
        char[]arregloVocales = new char [cantidad_vocales];
        char[]arregloConsonantes = new char[cantidad_consonantes];
        asignarArrs(arregloMix,arregloVocales,arregloConsonantes);
        mostrar(arregloVocales, arregloConsonantes);
    }
}
