public class tp2_ej3 {
    public static void main(String[] args){
        //Escribir un programa que solicite el ingreso de un número mayor a
        //50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
        int num = 0;
        System.out.println("ingrese un numero mayor a 50: ");
        num = Utils.leerInt();
        if ((num>50) && (num%2==0))
        System.out.println("el numero multiplo de 2 es: "+ num);
        else if ((num>50) && (num%3==0))
            System.out.println("el numero multiplo de 3 es: "+num);
        else
            System.out.println("el numero es erroneo");
    }
}
