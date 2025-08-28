public class tp2_ej14 {
    public static void main(String[] Args) {
        //Pedir por consola el ingreso de 10 números enteros positivos.
        //Contar cuántas veces se ingresaron números pares y mostrarlo
        //por pantalla
        int numeros = 0;
        int pares = 0;

        System.out.println("Ingrese 10 números positivos:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros = Utils.leerInt();

            if (numeros > 0) {
                if (numeros % 2 == 0) {
                    pares++;
                }
            } else {
                System.out.println("Número no positivo. No se cuenta.");
            }
        }

        System.out.println("Total de pares ingresados: " + pares);
    }
}