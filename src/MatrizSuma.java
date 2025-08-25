public class MatrizSuma {
    public static void main(String[] args) {
        final int MAX = 5;
        int[][] matriz = {
                {10, 20, 30},
                {15, 25, 15},
                {12, 22, 32}
        };

        int[] arr = {0, 1, 2, 2, 1};

        int suma = 0, valor = 0;
        for (int i = 0; i < MAX - 1; i++) {
            valor = matriz[arr[i]][arr[i + 1]];
            if (valor < suma) {
                suma -= valor;
            } else {
                suma += valor;
            }
        }

        System.out.println("La suma final es: " + suma);
    }
}