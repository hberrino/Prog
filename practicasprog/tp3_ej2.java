public class tp3_ej2 {
    //Escribir un programa que mientras el usuario cargue desde
    //teclado un carácter letra minúscula, llame a un método que
    //imprime por pantalla la tabla de multiplicar del 9.
    public static void tablaMulti (){
        int i = 0;
        for (i=1 ; i <= 10; i++){
            System.out.println("9 x "+ i + "=" + (9*i));
        }
    }
    public static char caracterIngresado (){
        char caracter = 'A';
        while (!(caracter >= 'a' && caracter <= 'z')){
            System.out.println("ingrese un caracter letra minuscula: ");
            caracter = Utils.leerChar();
        }
        return caracter;
    }
    public static void main (String[] args) {
        int caracter = caracterIngresado();
        while (caracter >= 'a' && caracter <= 'z'){
            System.out.print ("tabla del 9: ");
            tablaMulti();
            caracter = caracterIngresado();
        }
        System.out.println("Fin");
    }
}

