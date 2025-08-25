public class arrays_ej13 {
    //Dado un arreglo de caracteres de tamaño MAX, hacer un
    //programa que implemente métodos tal que devuelva al main dos
    //arreglos: un arreglo con los caracteres que son letras vocales y
    //otro con los que son consonantes.


    public static final int Max = 5;


    public static void arregloVocal(char[] arrEntrada) {
        char[] consonantes = new char[Max];
        char[] vocales = new char[Max];
        int vocal = 0;
        int consonante = 0;
        for (int pos = 0; pos < arrEntrada.length; pos++) {
            boolean esConsonante = false;
            boolean esVocal = false;
            if (arrEntrada[pos] == 'a' || arrEntrada[pos] == 'e' || arrEntrada[pos] == 'i' || arrEntrada[pos] == 'o' || arrEntrada[pos] == 'u') {
                esVocal = true;
            } else
                esConsonante = true;
            if (esVocal) {
                vocales[vocal] = arrEntrada[pos];
                vocal++;
            }
            if (esConsonante) {
                consonantes[consonante] = arrEntrada[pos];
                consonante++;
            }
        }
        for (int i = 0; i < vocales.length; i++) {
            System.out.println("son vocales: " + vocales[i]);
        }
        for (int i = 0; i < consonantes.length; i++) {
            System.out.println("son consonantes: " + consonantes[i]);
        }
    }


    public static void main(String[] args) {
        char[]arregloGral = {'a','b','c','d','e','f'};
        arregloVocal(arregloGral);
    }
}