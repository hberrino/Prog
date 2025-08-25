public class arrays_ej21 {
    //Hacer un programa que inserte un elemento en un arreglo
    //(ordenado decrecientemente) de tamaño MAX=10.



    public static final int Max=10;


    public static void insertarElementEnDecreciente (int[]arr, int cantidad, int n){
        int pos = 0;
        if (cantidad<Max){
            while (pos<cantidad && arr[pos]> n){
                pos++;
            }
            for (int i=cantidad;i>pos;i--){
                arr[i]=arr[i-1];
            }
            arr[pos] = n;
            for (pos=0;pos<Max;pos++) {
                System.out.print(arr[pos] + " ");
            }
        }else if (cantidad >= Max){
            System.out.println("No hay mas espacio");
        }

    }
    public static void main(String[] args) {
        int[]arreglo = {90,80,70,60,50,0,0,0,0,0};
        int cantidad = 5;
        System.out.println('\n'+"ingrese un elemento a guardar en el arreglo: ");
        int n = Utils.leerInt();
        insertarElementEnDecreciente(arreglo, cantidad, n);
    }
}
