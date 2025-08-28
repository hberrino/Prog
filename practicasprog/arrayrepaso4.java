public class arrayrepaso4 {
    //9. Dado un arreglo de caracteres, determinar si en el arreglo existe al
    //menos una letra repetida.


    public static final int Max = 6;

    public static void check (char[]arr){
        int contadorRep=0;
        for (int pos = 0; pos<Max;pos++){
            for (int i = pos;pos<Max;pos++){
                if (arr[pos]==arr[i+1]){
                    contadorRep++;
                }
            }
        }
        if (contadorRep>0){
            System.out.println("hay repeticiones");
        }else
            System.out.println("no hay repeticiones");
    }


    public static void main(String[] args) {
        char[]arreglo = {'z','b','c','d','a','t'};
        check(arreglo);
    }
}
