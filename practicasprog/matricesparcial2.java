public class matricesparcial2 {
    public static final int MaxC = 20;
    public static final int MaxF = 7;
    public static final int Plan = 7;
    public static final double MinPorcentaje = 0.5;
    public static int Separador = 0;

    public static int buscarini(int[][] matriz, int fila, int ini) {
        while (ini < MaxC && matriz[fila][ini] == Separador) {
            ini++;
        }
        return ini;
    }

    public static int buscarfin(int[][] matriz, int fila, int ini) {
        while (ini < MaxC && matriz[fila][ini] != Separador) {
            ini++;
        }
        return ini - 1;
    }

    public static boolean pasadavalida(int[][] matriz, int fila, int ini, int fin) {
        boolean valida = true;
        while (ini < fin && valida) {
            if (matriz[fila][ini] < matriz[fila][ini + 1]) {
                valida = false;
            }
            ini++;
        }
        return valida;
    }

    public static boolean esdiavalido(int dia, int[] plansemanal) {
        boolean encontrado = false;
        int i = 0;
        while (i < Plan && !encontrado) {
            if (plansemanal[i] == dia) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    public static int contarDiasPlanificados(int[] plansemanal) {
        int contador = 0;
        int i = 0;
        while (i < Plan) {
            // Aceptamos día 0 solo si aparece en posición 0
            if (plansemanal[i] != 0 || i == 0) {
                contador++;
            }
            i++;
        }
        return contador;
    }

    public static void analisismatriz(int[][] matriz, int[] plansemanal) {
        int diasCumplidos = 0;
        int diasPlanificados = contarDiasPlanificados(plansemanal);

        for (int i = 0; i < MaxF; i++) {
            boolean esDiaEnPlan = esdiavalido(i, plansemanal);
            boolean diaValido = true;

            if (esDiaEnPlan) {
                int ini = 0;
                int fin = -1;

                while (ini < MaxC && diaValido) {
                    ini = buscarini(matriz, i, fin + 1);
                    if (ini < MaxC) {
                        fin = buscarfin(matriz, i, ini);
                        if (pasadavalida(matriz, i, ini, fin)) {
                            ini=fin+1;
                        } else {
                            diaValido=false;
                        }
                    }
                }

                if (diaValido) {
                    System.out.println("se cumplió el día planificado: "+i);
                    diasCumplidos++;
                }
            }
        }

        double porcentaje = (double) diasCumplidos / diasPlanificados;
        if (porcentaje * 100 >= MinPorcentaje*100){
            System.out.println("se cumplio con: "+porcentaje*100);
        }else System.out.println("no se ha cumplido, porcentaje: "+porcentaje*100);
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 300, 298, 298, 297, 0, 240, 233, 245, 240, 0, 257, 254, 254, 0, 234, 230, 222, 0, 0},
                {0, 310, 302, 284, 271, 0, 280, 263, 263, 0, 0, 0, 264, 264, 0, 234, 230, 0, 0, 0},
                {0, 310, 302, 294, 0, 0, 250, 243, 0, 242, 0, 257, 255, 253, 0, 234, 229, 0, 0, 0},
                {0, 315, 310, 300, 300, 0, 351, 333, 320, 0, 0, 0, 334, 320, 0, 454, 430, 420, 0, 0},
                {0, 410, 400, 397, 0, 0, 250, 243, 0, 0, 0, 257, 255, 253, 0, 234, 229, 220, 0, 0},
                {0, 0, 420, 430, 430, 450, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 415, 425, 435, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[] plansemanal = {2, 0, 3, 0, 0, 1, 0};
        analisismatriz(matriz, plansemanal);
    }
}