public class tp3_ej6 {
    // Escribir un programa que mientras el usuario ingrese un
    //número entero entre 1 y 10 realice:
    //a. Si el numero ingresado es múltiplo de 3 pida ingresar un
    //caracter y para el caracter ingresado imprima a qué tipo de
    //carácter está asociado:
    //i. “letra minúscula” si el carácter es una letra del
    //abecedario en minúscula;
    //ii. “letra mayúscula” si el carácter es una letra del
    //abecedario en mayúscula;
    //iii. “dígito” si el carácter corresponde a un número;
    //iv. “otro” para los restantes casos de caracteres.
    //b. Si el número ingresado es múltiplo de 5 imprima la tabla de
    //multiplicar del número ingresado.

    public static void caracterIngresado(){
        char caracterIn = ' ';
        System.out.println("ingrese un caracter: ");
        caracterIn = Utils.leerChar();
        if (caracterIn >= 'a' && caracterIn<= 'z') {
        System.out.println(caracterIn + " " + "es: " + "Minúscula");
        } else if (caracterIn >= 'A' && caracterIn <= 'Z') {
            System.out.println(caracterIn + " " + "es: " + "Mayúscula");
        } else if (caracterIn >= '1' && caracterIn <= '9'){
            System.out.println(caracterIn + " " + "es: " + "digito");
        } else
            System.out.println(caracterIn + " " + "es otro tipo de digito");
            System.out.println("ingrese un caracter: ");
            caracterIn = Utils.leerChar();

    }
    public static void main (String[] args){
        int numIngresado = 0;
        System.out.println("ingrese un numero del 1 al 10: ");
        numIngresado = Utils.leerInt();
        while (numIngresado >= 1 && numIngresado <= 10){
            if (numIngresado%3==0){
                caracterIngresado();
            }
            else if (numIngresado % 5 == 0){
                int i = 0;
                for (i=1; i <= 10 ; i++){
                    System.out.println("tabla del "+numIngresado + '\t' + numIngresado + "*" + i + "=" +(numIngresado*i));
                }
            }
            else System.out.println("no es multiplo de 3 ni 5");
        System.out.println("ingrese nuevamente un numero: ");
        numIngresado = Utils.leerInt();
        }
    }

}
