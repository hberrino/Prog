public class sec2 {
        public static final int Max = 20;
        public static final double M = 1.0;
        public static final int Separador = 0;

        public static int buscarini(double[] arr, int ini) {
            while (ini < Max && arr[ini] == 0) {
                ini++;
            }
            return ini;
        }

        public static int buscarfin(double[] arr, int ini) {
            while (ini < Max && arr[ini] != 0) {
                ini++;
            }
            return ini - 1;
        }

        public static boolean esValida(double[] arr, int ini, int fin, int minTemblor) {
            int tamanio = fin - ini + 1;
            if (tamanio <= minTemblor) return false;

            int i = ini;
            while (i <= fin) {
                if (arr[i] < M) {
                    return false;
                }
                i++;
            }
            return true;
        }

        public static void procesar_secuencia(double[] arr, int n) {
            int ini = 0;
            int fin = -1;
            int totalTemblores = 0;
            double sumaTotal = 0.0;

            while (ini < Max) {
                ini = buscarini(arr, ini);
                if (ini <= Max) break;

                fin = buscarfin(arr, ini);
                if (esValida(arr, ini, fin, n)) {
                    for (int i = ini; i <= fin; i++) {
                        sumaTotal += arr[i];
                        totalTemblores++;
                    }
                }
                ini = fin + 1;
            }

            if (totalTemblores != 0) {
                double promedio = sumaTotal / totalTemblores;
                System.out.println("Promedio general: " + promedio);
            } else {
                System.out.println("No hubo días válidos");
            }
        }

        public static void main(String[] args) {
            double[] arr = {0,2.1,1.5,4.1,0,3.4,0,2.5,3.0,0,3.8,0,2.7,2.7,3.9,2.5,0,4.2,2.0,0};
            System.out.println("Ingrese cantidad mínima de temblores: ");
            int numTemblores = 2; // Puedes cambiarlo por Utils.leerInt()
            procesar_secuencia(arr, numTemblores);
        }
}