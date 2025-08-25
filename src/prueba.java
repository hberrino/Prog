public class prueba {
    public static void main (String[] args){
        //
        int numero = 0;
        System.out.println ("ingrese un numero: ");
        numero = Utils.leerInt();
        if (numero % 2 == 0){
            System.out.println(numero + " " + "es par");

        }else
            System.out.println("el numero no es par");

    }

}
