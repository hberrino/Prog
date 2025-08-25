public class testingreso {
    //Ejercicio 1 - Repetición por N y M
    //Escriba un programa en Java que solicite al usuario ingresar dos números enteros positivos: N y M. Luego, el programa debe imprimir una secuencia en la que cada número del 1 al N se repita M veces.
    //Ejemplo de salida:
    //
    //Para N = 3 y M = 4 → 111122223333
    //
    //Para N = 2 y M = 5 → 1111122222
    //
    //Para N = 5 y M = 3 → 111222333444555
    public static void main(String[] args) {
        System.out.println("ingrese un numero N: ");
        int n = Utils.leerInt();
        System.out.println("ahora el numero de M: ");
        int m = Utils.leerInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i);
            }
        }

    }
//
     //let n = entrada ("numero");
     //let m = entrada ("numero");
     //for (int i =1; i<n;i++){
     //   } for (int j=1;j<=m;j++){          //Para N = 3 y M = 4 → 111122223333
     //         }consola(i);
     //}
     //

}
