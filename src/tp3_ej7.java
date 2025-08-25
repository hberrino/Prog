public class tp3_ej7 {
    //Escribir un método que retorne el mayor de dos números. Usar
    //ese método para calcular el máximo de una serie de números
    //ingresados por el usuario (20 números en total).
    public static int calculoMayor(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        System.out.println("BIENVENIDO");

        // Leer el primer número
        System.out.print("Ingrese el número 1: ");
        int mayor = Utils.leerInt();

        // Leer los otros 19 números
        for (int i = 2; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = Utils.leerInt();

            // Comparar con el actual mayor
            mayor = calculoMayor(mayor, num);
        }

        System.out.println("El mayor número ingresado fue: " + mayor);
    }
}
