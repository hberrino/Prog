public class arreglostest3pt2 {
    //Dado un arreglo de caracteres de tamaño MAX, hacer un
    //programa que implemente métodos tal que devuelva al main dos
    //arreglos: un arreglo con los caracteres que son letras vocales y
    //otro con los que son consonantes.

    public static final int Max=10;

    public static void main(String[] args) {
        char[] arregloGral = {'a', 'z', 'x', 'e', 'u', 'h', 'i', 'b', 'v', 'o'};
        char[] arregloVocales = new char[Max];
        char[] arregloConsonantes = new char[Max];

        int indiceVocales = 0;
        int indiceConsonantes = 0;

        for (int i = 0; i < Max; i++) {
            char c = arregloGral[i];
            if (esVocal(c)) {
                arregloVocales[indiceVocales] = c;
                indiceVocales++;
            } else {
                arregloConsonantes[indiceConsonantes] = c;
                indiceConsonantes++;
            }
        }

        // Mostrar resultados
        System.out.print("Vocales: ");
        for (int i = 0; i < indiceVocales; i++) {
            System.out.print(arregloVocales[i] + " ");
        }

        System.out.print("\nConsonantes: ");
        for (int i = 0; i < indiceConsonantes; i++) {
            System.out.print(arregloConsonantes[i] + " ");
        }
    }

    // Método auxiliar para saber si un carácter es vocal
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
