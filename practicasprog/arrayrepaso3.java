public class arrayrepaso3 {
    //Dado un arreglo de caracteres de tamaño MAX, hacer un
    //programa que implemente métodos tal que devuelva al main dos
    //arreglos: un arreglo con los caracteres que son letras vocales y
    //otro con los que son consonantes.
    public static final int Max = 10;

    public static void separar(char[] arr) {
        int contador_vocales = 0;
        int contador_consonantes = 0;
        for (int pos = 0; pos < Max; pos++) {
            if (arr[pos] == 'a' || arr[pos] == 'e' || arr[pos] == 'i' || arr[pos] == 'o' || arr[pos] == 'u') {
                contador_vocales++;
            } else
                contador_consonantes++;
        }
        char[] vocales = new char[contador_vocales];
        char[] consonantes = new char[contador_consonantes];
        int vocal = 0;
        int conson = 0;
        for (int pos = 0; pos < Max; pos++) {
            if (arr[pos] == 'a' || arr[pos] == 'e' || arr[pos] == 'i' || arr[pos] == 'o' || arr[pos] == 'u') {
                vocales[vocal++] = arr[pos];
            } else
                consonantes[conson++] = arr[pos];
        }
        for (int pos = 0; pos < contador_vocales; pos++) {
            System.out.println(vocales[pos] + " ");
        }
        for (int pos = 0; pos < contador_consonantes; pos++) {
            System.out.println(consonantes[pos] + " ");
        }
    }

    public static void main(String[] args) {
        char[]arregloGral = {'a','b','e','i','o','v','s','z','u','x'};
        separar(arregloGral);
    }
}
