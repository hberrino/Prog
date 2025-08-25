public class decero4 {
    //Buscar un elemento en un arreglo de caracteres ya cargado de
    //tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
    //estar indicarlo también.

    public static final int Max=10;


    public static void buscar (char[]arr, char n) {
        int coincidencias = 0;
        for (int pos = 0; pos < Max; pos++) {
            if (arr[pos] == n) {
                System.out.println("se ha encontrado el elemento en la posicion " + pos);
                coincidencias++;
            }
        }
        if (coincidencias == 0) {
            System.out.println("sin coincidencias");
        }
    }


    public static void main(String[] args) {
        char[]arreglo = {'a','Z','2','e','h','X','l','e','4','G'};
        System.out.print("ingrese caracter a buscar: ");
        char n = Utils.leerChar();
        buscar(arreglo, n);
    }
}
