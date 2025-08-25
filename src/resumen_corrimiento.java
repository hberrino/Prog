public class resumen_corrimiento {
    public static final int Max=10;
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int[]arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[]arr3 = {32,28,18,13,8,6,5,4,3,2};
        int[]arr4 = {4,6,12,14,18,22,23,27,30,32};
        //hacer corrimiento desde una posicion:
        System.out.println("ingresar pos");
        int n = Utils.leerInt();
        corrimientoDesdePos (arr, n); //corrimiento izquierda desde pos.
        System.out.println();
        hacerEspacioCorrimiento(arr, n);// hacer espacio con corrimiento derecha desde pos.
        System.out.println();
        System.out.println("ingrese numero a insertar");
        int h = Utils.leerInt();
        agregarAlPrincipio (arr, h); //agregar entero solicitado al principio.
        System.out.println();
        System.out.println("ingresar numero a buscar ocurrencia y eliminar: ");
        int j = Utils.leerInt();
        eliminarOcurrencias(arr2, j);//eliminar numero si esta en posicion y correr arreglo cada vez.
        System.out.println();
        System.out.println("ingresar numero a insertar arreglo decreciente: ");
        int l = Utils.leerInt();
        insertarEnOrdenadoDecre(arr3, l);
        System.out.println();
        System.out.println("ingresar numero a insertar arreglo creciente: ");
        int f = Utils.leerInt();
        insertarEnOrdenCre(arr4, f);
        System.out.println();

    }
    public static void corrimientoDesdePos (int[]arr, int n){
        for (int i=n;i<Max-1;i++){
            arr[i]=arr[i+1];
        }
        for (int arreglo : arr){
            System.out.print (arreglo+" ");
        }
    }
    public static void hacerEspacioCorrimiento (int[]arr, int n){
        for (int i=Max-1;i>=n;i--){
            arr[i]=arr[i-1];
        }
        for (int arreglo : arr){
            System.out.print (arreglo+" ");
        }
    }
    public static void agregarAlPrincipio (int[]arr, int h){
        for (int i=Max-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=h;
        for (int arreglo : arr){
            System.out.print (arreglo+" ");
        }
    }
    public static void eliminarOcurrencias (int[]arr, int j){
        int i = 0;
        while (i<Max){
            if (arr[i]==j){
                for (int h=i; h<Max-1;h++){
                    arr[h]=arr[h+1];
                }
            }else
                i++;
        }
        for (int arreglo : arr){
            System.out.print (arreglo+" ");
        }
    }
    public static void insertarEnOrdenadoDecre (int[]arr, int l){
        int i = 0;
        boolean insertado = false;
        while (i<Max){
            if (arr[i]<=l && !insertado) {               //si tiene que ir en la primera opcion
                for (int j = Max-1; j > i; j--) {        // porque "l" es mas grande q arr[0];
                    arr[j] = arr[j - 1];
                }
                arr[i] = l;
                insertado=true;
            }
            else if (i==Max-1 && arr[i]>=l && !insertado){ // si resulta q "l" es igual o mas bajo
                for (int j = Max-1; j >= i; j--) {         // que la ultima pos.
                    arr[j] = arr[j - 1];
                }
                arr[i] = l;
                insertado=true;
            }
            else if (arr[i]>l && l>arr[i+1]){               // si va en cualquier otra parte del arreglo
                for (int j=Max-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                arr[i+1]=l;
            }else
                i++;
        }
        for (int arreglo : arr){
            System.out.print (arreglo+" ");
        }
    }
    public static void insertarEnOrdenCre (int[]arr, int f){
        int i = 0;
        boolean insertado = false;
        while (i<Max){
            if (arr[i]>=f && !insertado){          //si es menor a la primera pos arr[0]
                for (int j=Max-1;j>i;j--){         //corremos e insertamos.
                    arr[j]=arr[j-1];
                }
                arr[i]=f;
                insertado=true;
            }
            else if (i==Max-1 && arr[i]<=f && !insertado){  //si es mayor a la ultima pos
                arr[i]=f;                                    //reemplazamos directo.
                insertado = true;
            }
            else if (arr[i]<f && f<arr[i+1]){
                for (int j=Max;j>i;j--){                    //insertar en otra parte del arreglo.
                    arr[j]=arr[j-1];
                }
                arr[i+1]=f;
            }else
                i++;
        }
        for (int arreglo : arr){
            System.out.print (arreglo+" ");
        }
    }
}
