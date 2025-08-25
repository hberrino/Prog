public class arrays_ej15 {
    //Implementar un método que realice un corrimiento a izquierda
    //en un arreglo ordenado de tamaño MAX=10 a partir de una
    //posición.

    public static final int Max=10;

    public static void cargar (int[]arr){
        System.out.println("Carga del arreglo");
        for (int pos =0;pos<Max;pos++){
            System.out.print((pos+1)+" "+"numero del arreglo: ");
            arr[pos] = Utils.leerInt();
        }
    }
    public static void muestra(int[]arr){
        for (int pos = 0;pos<Max;pos++){
            System.out.print(arr[pos]);
        }
    }
    public static void corrimiento (int[]arr){
        for (int pos = 1; pos<Max ;pos++){
            arr[pos-1] = arr[pos];
        }
    }
    public static void main(String[] args) {
        int temp = 0;
        int[]corrimientoIz = new int[Max];
        cargar(corrimientoIz);
        temp = corrimientoIz[0];
        corrimiento(corrimientoIz);
        corrimientoIz [9] = temp;
        muestra(corrimientoIz);
    }
}
