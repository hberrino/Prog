public class tiporecu {
/*
Un dispositivo que toma imágenes de un fenómeno natural está corriendo sobre una
plataforma tecnológica con recursos limitados. Cada imagen (representada por una matriz
de NxM) está compuesta por píxeles con valores entre 0 y 255. Se tiene implementado un
algoritmo de compresión que comprime aquellas porciones de la imagen distintas del color
negro (0 en la escala de valores del pixel). Dicho algoritmo procede de la siguiente manera:
por cada una de las filas de la matriz, toma cada secuencia delimitada por uno o mas
pixeles de color negro (valor 0) con más de X repeticiones de un valor de píxel (para ser
comprimida todos los elementos de la secuencia deben ser iguales), comprime la secuencia
poniendo en la primera posición el valor negado de la cantidad de ocurrencias y a
continuación el valor del pixel que se repite. Cada fila de la matriz empieza y termina con
uno o más pixeles negros.
Se pide implementar el algoritmo de descompresión que restablezca la matriz
original. Asumir que cada fila posee suficientes lugares como para realizar la
descompresión.
Ejemplo de matriz comprimida con X = 3:
	Además se debe informar la cantidad total de píxeles descomprimidos y la fila en la cual se
	encuentra la mayor cantidad de píxeles descomprimidos (la primera, si hubiese más de una).
	En este ejemplo, la cantidad total de píxeles descomprimidos fue 32 y la fila con más píxeles
	descomprimidos fue la fila 0.
*/


    class resolucion {
        final static int MAXFILAS=3, MAXCOLUMNAS=20, SEPARADOR=0;
        public static void main(String[] args) {

            int[][] imagen={{0,-8,67, 0,14, 0,-4,33, 0, 5,98, 0, 0,0,0,0,0,0,0,0},
                    {0, 0,25,25, 0,-5, 3, 0,25,44,44, 0,-4,1,0,0,0,0,0,0},
                    {0,44,44,44, 0,-7,15, 0,-4, 9, 0,12, 0,0,0,0,0,0,0,0}
            };
            mostrarMatriz(imagen);
            // para cada fila recorrer las secuencias y contar los pixeles descomprimidos
            // quedarme con la fila que mas descomprimidos tiene
            // informar
            descomprimirImagen(imagen);
            mostrarMatriz(imagen);
        }

        public static void descomprimirImagen(int[][] matriz) {
            // iterar por cada fila y
            //contar los pixeles descomprimidos
            //quedarme la fila que mas descomprimidos tiene
            // imprimir
            int filaMayor=0,cantTotalPixeles=0,cantMayorPixeles=0;
            for (int fila=0;fila<MAXFILAS;fila++) {
                int cantFilaPixeles=descomprimirFila(matriz,fila);
                cantTotalPixeles+=cantFilaPixeles;
                if (cantFilaPixeles>=cantMayorPixeles) {
                    cantMayorPixeles=cantFilaPixeles;
                    filaMayor=fila;
                }
            }
            System.out.println("La cantidad total de pixeles descomprimidos fue: " + cantTotalPixeles);
            System.out.println("La fila con la mayor cantidad de pixeles descomprimidos fue la fila: "+ filaMayor);
        }

        public static int descomprimirFila(int[][] matriz, int fila) {
            int ini=0,fin=-1,cantPixelesFila=0;
            while (ini<MAXCOLUMNAS) {
                ini=buscarInicio(matriz[fila],fin+1);
                if (ini<MAXCOLUMNAS) {
                    fin=buscarFin(matriz[fila],ini);
                    // encontre una secuencia
                    if(matriz[fila][ini]<0) {
                        // me debe retornar la cantidad de pixeles descomprimidos
                        int cantidadPixeles=descomprimirSecuencia(matriz[fila],ini,fin);
                        // actualizar el fin
                        cantPixelesFila+=cantidadPixeles;
                        fin = fin + (cantidadPixeles-2);
                    }
                }
            }
            return cantPixelesFila;
        }

        public static int descomprimirSecuencia(int[] arr, int ini, int fin) {
            int cantidad=(-1)*arr[ini];
            arr[ini]=arr[fin];
            for (int i=0;i<cantidad-2;i++) {
                correrDerecha(arr,ini);
            }
            return cantidad;
        }

        public static void correrDerecha(int[] arr, int pos){
            for (int i=MAXCOLUMNAS-1;i>pos;i--)
                arr[i]= arr[i-1];
        }

        public static int buscarInicio(int[] arr, int ini){
            while (ini<MAXCOLUMNAS && arr[ini]==SEPARADOR)
                ini++;
            return ini;
        }

        public static int buscarFin(int[] arr, int ini){
            while (ini<MAXCOLUMNAS && arr[ini]!=SEPARADOR)
                ini++;
            return ini-1;
        }

        public static void mostrarMatriz(int[][] matriz) {
            for (int fila = 0; fila < MAXFILAS; fila++) {
                for (int columna = 0; columna < MAXCOLUMNAS; columna++)
                    System.out.print(matriz[fila][columna] + "|");
                System.out.println();
            }
        }

    }
}
