public class tipoparcialnew3 {
        public static final int MaxC = 16;
        public static final int MaxF = 4;
        public static final int Separador = 32;

        public tipoparcialnew3() {
        }

        public static int buscarini(char[] arr, int ini) {
            while(ini < MaxC && arr[ini] == ' ') {
                ++ini;
            }

            return ini;
        }

        public static int buscarfin(char[] arr, int ini) {
            while(ini < MaxC && arr[ini] != ' ') {
                ++ini;
            }

            return ini - 1;
        }

        public static boolean secuenciaValida(char[] arr, int ini, int fin) {
            char c = arr[ini];
            int tam = fin - ini + 1;
            if (tam < 2) {
                return false;
            } else {
                return c >= 'A' && c <= 'Z';
            }
        }

        public static boolean esVocal(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }

        public static void duplicar(char[] arr, int pos) {
            for(int i = MaxC-1; i > pos; --i) {
                arr[i] = arr[i - 1];
            }

        }

        public static int cifrar(char[] arr, int ini, int fin) {
            int cantidad = 0;

            for(int j = ini; j <= fin && j < MaxC-1; ++j) {
                if (esVocal(arr[j])) {
                    duplicar(arr, j);
                    ++j;
                    ++fin;
                    ++cantidad;
                }
            }

            int i = ini;

            for(int k = fin; i < k; --k) {
                char temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                ++i;
            }

            return cantidad;
        }

        public static int analizarEncriptado(char[] arr) {
            int ini = 0;
            int fin = -1;
            int encriptados = 0;

            while(ini < MaxC) {
                ini = buscarini(arr, fin + 1);
                if (ini < MaxC) {
                    fin = buscarfin(arr, ini);
                    if (secuenciaValida(arr, ini, fin)) {
                        int cantidad = cifrar(arr, ini, fin);
                        ++encriptados;
                        fin = fin + cantidad + 1;
                    } else {
                        ini = fin + 1;
                    }
                }
            }

            return encriptados;
        }

        public static void mostrar(char[][] matriz) {
            for(int i = 0; i < MaxF; ++i) {
                for(int j = 0; j < MaxC; ++j) {
                    System.out.print(matriz[i][j] + " ");
                }

                System.out.println();
            }

        }

        public static void main(String[] args) {
            char[][] matriz = new char[][]{{' ', 'e', 'l', ' ', 'A', 'g', 'e', 'n', 't', 'e', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', 'J', 'a', 'm', 'e', 's', ' ', 'B', 'o', ' ', 's', 'e', ' ', ' ', ' ', ' '}, {' ', 'e', 'n', 'c', 'u', 'e', 'n', 't', 'r', 'a', ' ', 'e', 'n', ' ', ' ', ' '}, {' ', 'C', 'o', 'l', 'o', 'n', 'i', 'a', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
            int encriptados = 0;

            for(int i = 0; i < MaxF; ++i) {
                encriptados += analizarEncriptado(matriz[i]);
            }

            System.out.println("se han encriptado: " + encriptados);
            System.out.println();
            mostrar(matriz);
        }
}
