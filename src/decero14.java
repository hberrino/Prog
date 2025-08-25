public class decero14 {
    //Dado un arreglo de caracteres de tamaño MAX, hacer un
    //programa que implemente métodos tal que devuelva al main: un
    //arreglo con las posiciones de los caracteres que son letras
    //vocales y otro con las posiciones que son consonantes.

    public static final int Max=10;

    public static boolean esVocal (char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static int cantidadVocal (char[]arr){
        int cantidad_vocal=0;
        for (int pos=0;pos<Max;pos++){
            if(esVocal(arr[pos])){
                cantidad_vocal++;
            }
        }
        return cantidad_vocal;
    }

    public static void asignarPos (char[]arrmix, int[]arrvoc, int[]arrcon){
        int iterador1=0;
        int iterador2=0;
        for (int pos =0;pos<Max;pos++){
            if (esVocal(arrmix[pos])){
                arrvoc[iterador1++]=(char)pos;
            }
            else
                arrcon[iterador2++]=(char)pos;
        }
    }
    public static void mostrarArrs (char[]arr1, int[]arr2, int[]arr3){
        System.out.println("ARREGLO ORIGINAL");
        for (int pos=0;pos<Max;pos++){
            System.out.print(arr1[pos]+" ");
        }
        System.out.println("\nARREGLO POSICION VOCALES");
        for (int pos=0;pos<arr2.length;pos++){
            System.out.print(arr2[pos]+" ");
        }
        System.out.println("\nARREGLO POSICION CONSONANTES");
        for (int pos=0;pos<arr3.length;pos++){
            System.out.print(arr3[pos]+" ");
        }
    }

    public static void main(String[] args) {
        char[]arregloMix = {'a','b','e','c','i','h','o','z','l','u'};
        int cantidad_vocales = cantidadVocal(arregloMix);
        int cantidad_conson = Max-cantidad_vocales;
        int[]arregloPosVoc = new int [cantidad_vocales];
        int[]arregloPosCon = new int [cantidad_conson];
        asignarPos(arregloMix, arregloPosVoc, arregloPosCon);
        mostrarArrs(arregloMix, arregloPosVoc, arregloPosCon);
    }
}
