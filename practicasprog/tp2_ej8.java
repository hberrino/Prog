public class tp2_ej8 {
    public static void main(String[] Args){
    //Escribir un programa que mientras que el usuario ingrese un
        //número entero distinto de 0, pida ingresar otro número entero y lo
        //imprima.
        int numeroingresado = 0;
        System.out.println("ingrese un numero: ");
        numeroingresado = Utils.leerInt();
        while (numeroingresado != 0) {
            System.out.println ("el numero es: "+numeroingresado);
            System.out.println ("ingrese nuevamente otro numero: ");
            numeroingresado = Utils.leerInt();
        }
    }
}
