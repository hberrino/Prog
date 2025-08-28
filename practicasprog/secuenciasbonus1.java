public class secuenciasbonus1 {
    //Un sismógrafo ubicado en la ciudad de Mendoza, Argentina,
    //registró una fuerte actividad sísmica en los últimos días. Los datos
    //están en escala de Richter, y están representados en el siguiente
    //arreglo:
    //Cada día de actividad sísmica está separada por un cero. Cada
    //secuencia representa qué sismos hubo en esa jornada. Entonces,
    //con la información provista, se pide calcular el promedio de
    //actividad sísmica para aquellos días donde hubo un número
    //mayor a N de temblores y que todas las magnitudes de dicho día
    //sean de un mínimo de M en la escala de Richter
    //Por ejemplo, si N=1 y M=2.0// sacar promedio.
    public static final int Max=20;
    public static final double M=1.0;
    public static final int Separador=0;
    public static int buscarini(double[]arr, int ini){
        while (ini<Max && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (double[]arr, int ini){
        while (ini<Max && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
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
    public static void procesar_secuencia (double[]arr, int n) {
        int ini = 0;
        int fin = -1;
        int conteo = 0;
        double suma = 0.0;
        while (ini < Max) {
            ini = buscarini(arr, ini);
            if (ini <= Max) {
                fin = buscarfin(arr, ini);
                if (esValida(arr, ini, fin, n)) {
                    for (int i = ini; i < fin; i++) {
                        suma += arr[i];
                        conteo++;
                    }
                }
            }
            ini = fin + 1;
        }
        if (conteo != 0) {
            double PromedioxDia = suma / conteo;
            System.out.println(PromedioxDia);
        }
    }

    public static void main(String[] args) {
        double[]arr = {0,2.1,1.5,4.1,0,3.4,0,2.5,3.0,0,3.8,0,2.7,2.7,3.9,2.5,0,4.2,2.0,0};
        System.out.println("ingrese cantidad de temblores minimo para un dia: ");
        int numTemblores = Utils.leerInt();
        procesar_secuencia (arr, numTemblores);

    }
}
