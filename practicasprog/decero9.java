public class decero9 {
    //Dado un arreglo de caracteres, determinar si en el arreglo existe al
    //menos una letra repetida.
    public static final int Max=10;

    public static boolean checkRep (char[]arr){
        int i=0;
        while (i<Max-1){
            int j=i+1;
            while (j < Max-1){
                if(arr[i]==arr[j]) {
                    return true;
                }else
                    j++;
            }
            i++;
        }
        return false;
    }


    public static void main(String[] args) {
        char[]arreglorep = {'a','b','c','d','a','e','f','g','h','i'};
        if (checkRep(arreglorep)){
            System.out.println("hay una repeticion al menos");
        }else
            System.out.println("no hay repeticiones");
    }
}
