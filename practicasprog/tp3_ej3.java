public class tp3_ej3 {
    //Escribir un programa que mientras el usuario cargue desde
    //teclado un número entero distinto de 0, imprima por pantalla la
    //suma que se obtiene de invocar un método que calcula la
    //sumatoria de los primeros 200 números naturales (son números
    //enteros entre 1 y 200).
    public static int validacion (){
        int numero;
        System.out.println("ingrese un numero distinto de 0: ");
        return Utils.leerInt();
    }

    public static int Sumatoria() {
        int suma = 0;
        int i = 0;
        for (i = 0; i <= 200; i++) {
            suma += i;
        }
      return suma;
    }
    public static void main(String[] args) {
        int numero = validacion();
        while (numero != 0) {
            System.out.println("sumatoria de los primeros 200 numeros naturales:" + '\n' + Sumatoria());
            numero = validacion();
        }
    }
}
