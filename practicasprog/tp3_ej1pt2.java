public class tp3_ej1pt2 {
    // Escribir un diseño de programa que mientras que el usuario
    // ingrese un número distinto de 0, pida ingresar otro número y lo imprima

    public static void esDistinto() {
        System.out.print("Ingrese un número (0 para salir): ");
        int num = Utils.leerInt();

        while (num != 0) {
            System.out.println("Número ingresado: " + num);
            System.out.print("Ingrese un número (0 para salir): ");
            num = Utils.leerInt();
        }
    }

    public static void main(String[] args) {
        esDistinto();
        System.out.println("Programa finalizado.");
    }
}