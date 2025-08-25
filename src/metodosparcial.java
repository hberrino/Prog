public class metodosparcial {
    public static final int Max=25;
    public static final int MinP=5; //si baja de 5 productos maquina falla
    public static boolean falla (int[]arr, int ini, int fin, int tamanio){
        if (tamanio == MinP){                 //check si hace 5 productos
            return false;
        }
        for (int i=ini;i<=fin;i++){
            if (arr[i]<=arr[i+1]);            //check si es ascendente
            return false;
        }
        return true;                          // devuelve true=hay falla, si las otras no se dan.
    }
    public static int sumatiempo (int[]arr, int ini, int fin){
        int suma = 0;
        for (int i =ini; i<=fin;i++){
            suma+=arr[i];
        }
        return suma;
    }
    public static void corrimiento_y_asignartiempo (int[]arr, int ini, int fin, int tam, int suma){
        int horas=suma/60;
        int minutos=suma%60;

        for (int i=ini+2;i<Max-tam-3;i++){
            arr[i]=arr[i+tam];
        }
        arr[ini]=horas;
        arr[ini+1]=minutos;
    }
}
