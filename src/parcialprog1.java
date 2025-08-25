public class parcialprog1 {
    public static final int Max=25;
    public static final int minsxhora=60;

    public static int buscarini (int[]arr, int ini){
        while (ini<Max && arr[ini]<0){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while (ini<Max && arr[ini]>=0){
            ini++;
        }
        return ini-1;
    }
    public static void procesar (int[]arr){
        int ini =0; int fin = -1; int maquina=0;
        while (ini<Max){
            ini=buscarini(arr, fin+1);
            if (ini<Max){
                fin = buscarfin(arr, ini);
                maquina++;
                if (falla(arr, ini, fin)){
                    System.out.println("maquina "+maquina+" con desperfecto");
                }else{
                    System.out.println("sin desperfecto en maquina: "+maquina);
                    int sumatiempo = sumar(arr, ini, fin);
                    arr[ini]=sumatiempo/minsxhora;
                    arr[ini+1]=sumatiempo%minsxhora;
                    correr(arr, ini+2, fin);
                    fin=ini+1;
                }
            }
        }
    }
    public static int sumar (int[]arr, int ini, int fin){
        int suma = 0;
        for (int i =ini;i<=fin;i++){
            suma+=arr[i];
        }
        return suma;
    }
    public static void correr (int[]arr, int ini, int fin){
        for (int i=ini;i<=fin;i++){
            corrimientoizq(arr, ini);
        }
    }
    public static void corrimientoizq (int[]arr, int pos){
        for (int i=pos;i<Max-1;i++){
            arr[i]=arr[i+1];
        }
    }
    public static boolean falla (int[]arr, int ini, int fin){
        boolean gradual = false;
        int tam = fin-ini+1;
        if (tam<5){
            return false;
        }
        while (ini<fin && !gradual){
            if (arr[ini]<arr[ini+1]){
                gradual=true;
            }
            ini++;
        }
        return gradual;
    }
    public static void mostrar(int[]arr){
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {-6, -8, 10, 12, 14, 15, 20, -1, 15, 14, 13, 16, -8, -10, 2, 3, 5, 16, 26, -3, 56, 52, 54, 60, -7};
        procesar(arr);
        mostrar(arr);
    }
}
