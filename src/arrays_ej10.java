public class arrays_ej10 {
    //Hacer un programa que verifique en un arreglo si tiene al
    //menos N números primos. N debe ser ingresado por el usuario.
    //Reutilizar los métodos ya desarrollados.
    public static final int Max=10;


    public static void cargar (int[]arr){
        for (int pos = 0;pos < Max; pos++){
            System.out.println("cargar numero para la posicion "+(pos+1)+":");
            arr[pos] = Utils.leerInt();
        }
    }

    public static void verifPrimo (int[]arr){
        for (int pos = 0;pos < Max;pos++){
            if (arr[pos]%arr[pos]==0 && arr[pos]%2!=0) {
                System.out.println("es primo" + " " + arr[pos]);
            }
        }
    }



    public static void main(String[] args) {
        int[] seraprimo = new int[Max];
        cargar(seraprimo);
        verifPrimo(seraprimo);

    }
}
