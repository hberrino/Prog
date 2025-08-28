public class arrays_ej16 {
    //Hacer un programa que dado un arreglo de enteros de tamaño
    //10 que se encuentra cargado, solicite al usuario un número entero
    //y lo agregue al principio del arreglo (posición 0). Para ello tendrá
    //que realizar un corrimiento a derecha (se pierde el último valor del
    //arreglo) y colocar el número en el arreglo en la posición indicada.

    public static final int Max=10;

    public static void cargar (int[]arr){
        System.out.println("Carga del arreglo: ");
        for (int pos = 0; pos<Max; pos++){
            System.out.print((pos+1)+" "+"numero a cargar: ");
            arr[pos] = Utils.leerInt();
        }
    }
    public static void corrimientoDer (int[]arr){
        for (int pos = 9; pos>=1;pos--){
            arr[pos]=arr[pos-1];
        }
    }

    public static void mostrarArr (int[]arr){
        for (int pos=0;pos<Max;pos++){
            System.out.println(arr[pos]);
        }



    }

    public static void main(String[] args) {
        int numUser = 0;
        int[] insertarArr = new int[Max];
        cargar(insertarArr);
        System.out.println("ingrese un numero a reemplazar en la pos 0: ");
        numUser = Utils.leerInt();
        corrimientoDer(insertarArr);
        insertarArr[0]=numUser;
        mostrarArr(insertarArr);
    }
}
