public class arrays_ej4 {
    //Buscar un elemento en un arreglo de caracteres ya cargado de
    //tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
    //estar indicarlo también.
    public static final int Max = 10;

    public static void main(String[] args) {
        char[] arreglo = new char[Max];
        char element = ' ';
        carga(arreglo);
        System.out.println("ingrese el elemento a buscar: ");
        element = Utils.leerChar();
        busquedaPos(arreglo, element);

    }

    public static void carga(char[] arr) {
        for (int pos = 0; pos < Max; pos++) {
            System.out.println("ingrese un caracter para cada posicion: ");
            arr[pos] = Utils.leerChar();
        }
    }

    public static void busquedaPos(char[] arr, char element) {
        boolean encontrado = false;
        for (int pos = 0; pos < Max; pos++) {
            if (arr[pos] == element) {
                System.out.println("Se ha encontrado ese elemento en la posición: " + pos);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El elemento no se encuentra en el arreglo.");
        }
    }
}