public class mostrardivisores {
    public static void main(String[] args) {
        //mostrar divisores
        System.out.println("ingrese un numero: ");
        int num =Utils.leerInt();
        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
// let numero = leer ("numero")
// for (int i=1;i<=num;i++){             // mostrar DIVISORES de NUM ingresado
//} if(numero % i==0){
//    } consola (i);
//}

// let numero = leer ("numero")
// for (int i=1;i<=num;i++){             // mostrar PARES hasta NUM ingresado
//} if(i % 2==0){
//    } consola (i);
//}

// let numero = leer ("numero")
// for (int i=1;i<=num;i++){             // mostrar IMPARES hasta NUM ingresado
//} if(i % 2!=0){
//    } consola (i);
//}


