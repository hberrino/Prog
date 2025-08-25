public class tp2_ej4 {
    public static void main(String[] args){
        // Escribir un programa donde el usuario ingrese un número entre 0
        //y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
        //tiene 3 dígitos debe informar qué número es.
        int num = 0;
        System.out.println ("ingrese un numero entre 0 y 999");
        num = Utils.leerInt();
        if ((num>=0) && (num<=999)) {
            if (num >= 0 && num < 10)
                System.out.println("el numero es: " + num + " " + "y tiene 1 digito");
            else if ((num >= 10) && (num < 100))
                System.out.println("el numero es: " + num + " " + "y tiene 2 digitos");
            else if ((num >= 100) && (num <= 999))
            System.out.println("el numero es: " + num + " " + "y tiene 3 digitos");
        }
        else{
            System.out.println("numero ingresado incorrecto");
        }
    }
}
