public class arraytest {
    public static final int Max=5;

    public static void cargaArr (int[] arr){
        for (int pos = 0; pos < Max; pos++){
            System.out.println("ingrese un numero para cada posicion: ");
            arr[pos] = Utils.leerInt();
        }
    }
    public static void main (String[] args){
        int[] arreglotest = new int[Max];
        cargaArr(arreglotest);
        arreglotest[0]= arreglotest[4];
        for (int i=0;i<Max;i++){
            System.out.println(arreglotest[i]);
        }


    }

}
