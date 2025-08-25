public class comprimirsecuencia3 {
    public static final int Max=20;
    public static final int Separador=0;
    public static int buscarini(int[]arr, int ini){
        while (ini<Max && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin(int[]arr, int ini){
        while (ini<Max && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static void procesar (int[]arr){
        int ini=0;
        int fin =-1;
        while (ini<Max){
            ini=buscarini(arr, ini);
            if (ini<Max){
                fin=buscarfin(arr, ini);
                int pos=buscarpos(arr,ini,fin);
                corrimiento(arr, ini, fin, pos);
            }
        }

    }
    public static void corrimiento (int[]arr, int ini, int fin, int pos){
        int i = pos;
        while (i<fin){
            arr[i]=arr[i+1];
            i++;
        }
    }
    public static int buscarpos (int[]arr, int ini, int fin){
        int i =ini;
        while (i<=fin){
            if (arr[i]==45){
                return i;
            }else
                i++;
        }
        return-1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 45, 20, 30, 20, 15, 0, 0, 15, 0, 21, 21, 21, 21, 0, 7, 8, 0, 0};
        procesar(arr);
        for (int arreglo : arr){
            System.out.print(arreglo+" ");
        }
    }
}
