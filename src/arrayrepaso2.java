public class arrayrepaso2 {
    public static final int Max=10;
    //Hacer un programa que dado un arreglo de enteros y un número
    //N, genere un arreglo con las posiciones donde se encuentra dicho
    //número. A continuación, multiplicar por un número M todas las
    //ocurrencias del número N en el arreglo original.

    public static void busqueda (int[]arr, int n, int m){
        int count = 0;

        // Primera pasada: contar cuántas veces aparece n
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        // Crear arreglo con posiciones donde se encuentra n
        int[] posiciones = new int[count];
        int index = 0;

        // Segunda pasada: modificar el arreglo y llenar el arreglo de posiciones
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                posiciones[index++] = i;
                arr[i] = arr[i] * m;
            }
            System.out.print(arr[i]+" ");
        }
        for (int pos=0;pos<count;pos++){
            System.out.println(posiciones[pos]+" ");
        }
    }



    public static void main(String[] args) {
        int[]arreglo={2,5,6,3,2,7,2,1,4,2};
        System.out.println("ingrese el N a buscar: ");
        int n = Utils.leerInt();
        System.out.println("ingrese numero x cual multiplicar: ");
        int m = Utils.leerInt();
        busqueda(arreglo,n,m);
    }

}
