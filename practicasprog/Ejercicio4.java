public class Ejercicio4 {
    public static void main(String[] args) {
        //Escribir un programa que permita ingresar 5 números de a uno por
        //vez y que los muestre por pantalla en orden inverso:
        //Ejemplo: Ingreso: 23, 4, 2, 100, 3
        //Se debe mostrar: 3, 100, 2, 4, 23
        int a = 0, b= 0, c =0, d = 0, e= 0;
        System.out.println ("ingrese el pimer num.: ");
        a = Utils.leerInt();
        System.out.println ("ingrese el segundo num.: ");
        b = Utils.leerInt();
        System.out.println ("ingrese el tercer num.: ");
        c = Utils.leerInt();
        System.out.println ("ingrese el cuarto num.: ");
        d = Utils.leerInt();
        System.out.println ("ingrese el quinto num.: ");
        e = Utils.leerInt();

        System.out.println(e +"\n"+ d +"\n"+ c +"\n"+ b +"\n"+ a);

    }
}
