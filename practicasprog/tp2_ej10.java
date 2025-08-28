public class tp2_ej10 {
    public static void main(String[] args) {
        //10. Escribir un programa que mientras que el usuario ingrese un
        //número entero entre 1 y 10 inclusive, lleve la suma de los
        //números ingresados. Finalmente, cuando sale del ciclo muestre
        //por pantalla el resultado de la suma. ¿En qué casos termina?
        int numero = 0;
        int suma = 0;

        System.out.println("ingrese un numero: ");
        numero = Utils.leerInt();
        while (numero >= 1 && numero <= 10) {
            suma += numero; // acumula
            System.out.println("Ingrese otro número entre 1 y 10 (fuera de ese rango para salir): ");
            numero = Utils.leerInt();
        }
        {    System.out.println(suma);}
    }
}