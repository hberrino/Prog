public class Ejercicio5 {
    public static void main(String[] args){
        // Escribir un programa que solicite nombre, edad, altura y ocupación, y
        //los imprima por pantalla.
        String nombre;
        int edad;
        double altura;
        String ocupacion;

        System.out.println("ingrese su nombre: ");
        nombre = Utils.leerString();
        System.out.println("ingrese su edad: ");
        edad = Utils.leerInt();
        System.out.println("ingrese su altura: ");
        altura = Utils.leerDouble();
        System.out.println ("Cual es su ocupacion: ");
        ocupacion = Utils.leerString();
        System.out.println ("nombre: "+nombre +"\n"+"edad: "+edad +"\n"+"altura: "+altura +"\n"+"ocupacion: "+ocupacion);


    }
}
