public class decero11 {
    //Dado dos arreglos de números enteros A y B determinar si
    //todos los números almacenados en el arreglo A están presentes
    //en el arreglo B.

    public static void checkArrinArr (int[]arr1, int[]arr2){
        int contador = 0;
        for (int pos=0;pos<arr1.length; pos++){
            for (int j=pos;j<arr2.length; j++){
                if (arr1[pos]==arr2[j]){
                    contador++;
                }
            }
        }
        if (contador == arr1.length){
            System.out.println("todos los numeros del arreglo A, se encuentran en el B");
        }else
            System.out.println("no todos los numeros del arreglo A, se encuentran en el B");
    }


    public static void main(String[] args) {
        int[]enterosA = {1,2,3,4,5,6,7,8,9,10};
        int[]enterosB = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        checkArrinArr(enterosA, enterosB);
    }

}
