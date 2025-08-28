public class decero1 {
    //Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
    //de valores entre 1 y 12. Luego mostrar cómo quedó cargado.

    public static final int Max = 15;

    public static void cargar(int[]arr){
        for (int pos = 0;pos<Max;pos++){
            System.out.print("ingrese un numero a cargar en el arreglo: ");
            arr[pos]=Utils.leerInt();
        }
    }
    public static void mostrar(int[]arr){
        for (int pos = 0;pos<Max;pos++){
            System.out.println("numero en la pos "+(pos+1)+": "+arr[pos]);
        }
    }

    public static void main(String[] args) {
        int[]arreglo = new int [Max];
        cargar(arreglo);
        mostrar(arreglo);
    }
}
