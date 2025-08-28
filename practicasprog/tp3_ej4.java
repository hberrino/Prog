public class tp3_ej4 {
    // Realizar un programa que dado dos números enteros y un
    //carácter (todos ingresados por el usuario) muestre por pantalla el
    //resultado de una operación matemática básica según el valor del
    //carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
    //suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
    //división entre ambos números.
    public static int Suma(int num_a, int num_b) {
        return num_a + num_b;
    }

    public static int multiplicar(int num_a, int num_b) {
        return num_a * num_b;
    }

    public static int restar(int num_a, int num_b) {
        return num_a - num_b;
    }

    public static int dividir(int num_a, int num_b) {
        return num_a / num_b;
    }

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        char caracter = ' ';
        System.out.println("ingrese dos numeros enteros: ");
        numero1 = Utils.leerInt();
        System.out.println("el siguiente: ");
        numero2 = Utils.leerInt();
        System.out.println("ahora ingrese: 'a' para suma, 'b' para resta, 'c' para multiplicar, 'd' para division: ");
        caracter = Utils.leerChar();

        if (caracter == 'a') {
            System.out.println("la suma es:" + '\t' + Suma(numero1, numero2));
        } else if (caracter == 'b') {
            System.out.println("la resta es:" + '\t' + restar(numero1, numero2));
        } else if (caracter == 'c') {
            System.out.println("la multiplicacion es:" + '\t' + multiplicar(numero1, numero2));
        } else if (caracter == 'd') {
            System.out.println("la division es:" + '\t' + dividir(numero1, numero2));
        }
    }
}
