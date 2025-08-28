public class tp2_ej13 {
    public static void main(String[] Args){
        //Escribir un programa que mientras que el usuario ingrese un
        //caracter letra minúscula, pida ingresar un número entero. Si el
        //número ingresado está entre 1 y 5 inclusive deberá imprimir la
        //tabla de multiplicar de dicho número.
        char letra = ' ';
        int num = 0;
        int calculo = 0;
        int i = 0;
        System.out.println("ingrese un caracter letra minuscula: ");
        letra = Utils.leerChar();
        while (letra >= 'a' && letra <= 'z'){
            System.out.println ("ingrese un numero del 1 al 5 para su tabla de multiplicacion: ");
            num = Utils.leerInt();
            if (num >= 1 && num <= 5) {
                for (i = 1; i <= 10; i++) {
                    calculo = num * i;
                    System.out.println(num + "*" + i + "=" + calculo);
                }
            } else {
                System.out.println("El número no está entre 1 y 5. No se mostrará tabla.");
            }
        System.out.println("ingrese otro caracter letra minuscula para continuar: ");
            letra = Utils.leerChar();
        }
    System.out.println("no se ingreso caracter letra minuscula, programa finalizado");
    }
}
