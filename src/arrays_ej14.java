public class arrays_ej14 {
    //Implementar un método que realice un corrimiento a derecha
    //en un arreglo ordenado de tamaño MAX=10 a partir de una
    //posición.
public static final int Max = 5;

public static void cargarArr (int[]arr){
    for (int pos = 0; pos<Max;pos++){
        System.out.println("carga del arreglo:");
        arr[pos]=Utils.leerInt();
    }
}
public static void corrimiento (int[]arr){
    for (int pos=3;pos>=0;pos--){
        arr[pos+1]=arr[pos];
    }


}
public static void mostrarArr (int[]arr){
    for (int pos = 0; pos<Max;pos++){
        System.out.print(arr[pos]);
    }
}


public static void main(String[] args) {
    int temp = 0;
    int[]corrimiento= new int[Max];
        cargarArr(corrimiento);
        temp = corrimiento[4];
        corrimiento(corrimiento);
        corrimiento[0]=temp;
        mostrarArr(corrimiento);


    }
}
