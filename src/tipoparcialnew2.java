public class tipoparcialnew2 {
    public static final int MaxC = 20;
    public static final int MaxF = 7;
    public static final int Plan = 7;
    public static final double MinPorcentaje = 0.5;
    public static int Separador = 0;

    public static int buscarini(int[]arr, int ini){
        while(ini<MaxC && arr[ini]==Separador){
            ini++;
        }
        return ini;
    }
    public static int buscarfin (int[]arr, int ini){
        while (ini<MaxC && arr[ini]!=Separador){
            ini++;
        }
        return ini-1;
    }
    public static boolean esDia (int dia, int[]plan){
        int i=0;
        while (i<Plan){
            if (dia==plan[i]){
                return true;
            }
            i++;
        }
        return false;
    }
    public static boolean procesarDia (int[]dia){
        int ini=0;int fin=-1; boolean diaValido=true;
        while (ini<MaxC && diaValido){
            ini=buscarini(dia, fin+1);
            if(ini<MaxC){
                fin=buscarfin(dia, ini);
                if (esDescendente(dia, ini, fin)){
                    ini=fin+1;
                }else diaValido=false;
            }
        }
        return diaValido;
    }
    public static boolean esDescendente (int[]arr, int ini, int fin){
        while (ini<fin && arr[ini]>=arr[ini+1]){
            ini++;
        }
        return ini==fin;
    }
    public static void eliminar(int[] plan, int pos){
        int i=0;
        while (i<Plan){
            if(plan[i]==pos){
                plan[i]=0;
            }
            i++;
        }
    }
    public static void mostrarplan (int[]plan){
        for(int i=0;i<Plan;i++){
            System.out.print(plan[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 300, 298, 298, 297, 0, 240, 233, 245, 240, 0, 257, 254, 254, 0, 234, 230, 222, 0, 0},
                {0, 310, 302, 284, 271, 0, 280, 263, 263, 0, 0, 0, 264, 264, 0, 234, 230, 0, 0, 0},
                {0, 310, 302, 294, 0, 0, 250, 243, 0, 242, 0, 257, 255, 253, 0, 234, 229, 0, 0, 0},
                {0, 315, 310, 300, 300, 0, 351, 333, 320, 0, 0, 0, 334, 320, 0, 454, 430, 420, 0, 0},
                {0, 410, 400, 397, 0, 0, 250, 243, 0, 0, 0, 257, 255, 253, 0, 234, 229, 220, 0, 0},
                {0, 0, 420, 430, 430, 450, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 415, 425, 435, 420, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[] plansemanal = {2, 0, 3, 0, 0, 1, 0};
        int diasdeplan=0;
        int diascumplidos=0;
        for (int i=0;i<MaxF;i++) {
            if (esDia(i+1, plansemanal)) {
                diasdeplan++;
                if(procesarDia(matriz[i])){
                    System.out.println("cumplio con el dia: "+(i+1));
                    eliminar(plansemanal, i+1);
                    diascumplidos++;
                }else System.out.println("no se cumplio con el dia "+(i+1));
            }
        }
        double porcentaje=(double)diascumplidos/diasdeplan;
        mostrarplan(plansemanal);
        System.out.println();
        System.out.println("Porcentaje de cumplimiento: %"+porcentaje*100);
        if (porcentaje*100>=MinPorcentaje*100){
            System.out.println("APROBADO!");
        }else System.out.println("DESAPROBADO!");
    }
}