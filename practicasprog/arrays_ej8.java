public class arrays_ej8 {
    //Hacer un programa que determine si los valores almacenados en
    //un arreglo de enteros se encuentran en orden ascendente


    public static void checkGral (int[]arr) {
        int contadorAsc = 0;
        int contadorDes = 0;
        for (int pos = 0; pos < arr.length-1; pos++){
           if (arr[pos] < arr[pos+1]){
                   contadorAsc++;
           }else if(arr[pos] > arr[pos+1]){
                   contadorDes++;
           }

        }
        if (contadorAsc == 4){
            System.out.println("es ascendente");
        }else if(contadorDes == 4){
            System.out.println("es descendente");
        }else System.out.println("desordenado");
    }



    public static void main (String[] args){
        int[] arregloAsc = {1,2,3,4,5};
        int[] arregloDesordenado = {2,8,6,3,4};
        int[] arregloDes = {5,4,3,2,1};
        int[] arregloAsc2 = {2,4,6,8,10};
        checkGral(arregloAsc);
        checkGral(arregloDesordenado);
        checkGral(arregloDes);
        checkGral(arregloAsc2);

    }




}