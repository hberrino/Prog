public class test {

        public static final int Max = 20;

        public static int buscarini(int[] arr, int ini) {
            while (ini < Max && arr[ini] == 0) {
                ini++;
            }
            return ini;
        }

        public static int buscarfin(int[] arr, int ini) {
            while (ini < Max && arr[ini] != 0) {
                ini++;
            }
            return ini - 1;
        }

        public static boolean sonSecuenciasIguales(int[] orig, int ini1, int fin1, int[] patron, int ini2, int fin2) {
            if ((fin1 - ini1) != (fin2 - ini2)) {
                return false;
            }
            for (int i = 0; i <= fin1 - ini1; i++) {
                if (orig[ini1 + i] != patron[ini2 + i]) {
                    return false;
                }
            }
            return true;
        }

        public static void eliminarSecuencia(int[] orig, int ini1, int fin1) {
            for (int i = ini1; i <= fin1; i++) {
                orig[i] = 0;
            }
        }

        public static void procesar_secuencia(int[] arrorig, int[] arrpatron) {
            int ini1 = 0;
            while (ini1 < Max) {
                ini1 = buscarini(arrorig, ini1);
                if (ini1 < Max) {
                    int fin1 = buscarfin(arrorig, ini1);

                    int ini2 = 0;
                    boolean encontrada = false;

                    while (ini2 < Max && !encontrada) {
                        ini2 = buscarini(arrpatron, ini2);
                        if (ini2 < Max) {
                            int fin2 = buscarfin(arrpatron, ini2);
                            if (sonSecuenciasIguales(arrorig, ini1, fin1, arrpatron, ini2, fin2)) {
                                eliminarSecuencia(arrorig, ini1, fin1);
                                encontrada = true;
                            }
                            ini2 = fin2 + 1;
                        }
                    }

                    ini1 = fin1 + 1;
                }
            }

            // Mostrar resultado
            for (int i = 0; i < Max; i++) {
                System.out.print(arrorig[i] + " ");
            }
        }

        public static void main(String[] args) {
            int[] arrsecuencia = {0, 0, 10, 22, 2, 3, 0, 6, 13, 12, 6, 7, 0, 0, 0, 9, 10, 11, 12, 13};
            int[] patronsecuencia = {0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 6, 12, 6, 7, 0, 0, 0, 0, 0, 0};
            procesar_secuencia(arrsecuencia, patronsecuencia);
        }
    }

