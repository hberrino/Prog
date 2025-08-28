public class arrays_ej9 {
    //Dado un arreglo de caracteres, determinar si en el arreglo existe al
    //menos una letra repetida.
    public static final int Max = 10;

    public static void cargaArr (char[]arr){
        for (int pos = 0;pos < Max ; pos++){
            System.out.println("ingrese un char para la posicion "+(pos+1)+":");
            arr[pos] = Utils.leerChar();
        }
    }

    public static void checkRep (char[]arr) {
        int contador = 0;
        for (int pos = 0; pos < Max-1; pos++) {
            for (int i = pos+1; i < Max; i++) {
                if (arr[pos] == arr[i]) {
                    contador++;
                }
            }
        }
        if (contador!=0){
                System.out.println("se repiten"+" "+contador);
        }
    }




    public static void main(String[] args) {
        char[] arregloChars = new char[Max];
        cargaArr(arregloChars);
        checkRep(arregloChars);
    }
}
