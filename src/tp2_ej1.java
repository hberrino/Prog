public class tp2_ej1 {
    public static void main(String[] args){
        //a. solicite un número e indique si es positivo o negativo.
        //b. solicite un número e imprima “grande” si es mayor a 100 y
        //“chico “ si es menor.
        //c. solicite un número del 1 al 7 e imprima el día de la semana.
        //d. solicite una letra e imprima si es vocal o consonante.
        //e. solicite 3 números e imprima “creciente” si los tres números
        //están en orden creciente, “decreciente” si están en orden
        //decreciente o “error” si no cumplen ningún orden
        int numero1,numero2,numero3,num1,num2,num3;
        char letra1;

        System.out.println("ingrese un numero: ");
        numero1 = Utils.leerInt();
        if (numero1 > 0 )
            System.out.println ("el numero es positivo");
        else if (numero1 < 0)
            System.out.println("el numero es negativo");
        else
            System.out.println("Ingreso un numero neutro o no valido");

        System.out.println("ingrese un numero: ");
        numero2 = Utils.leerInt();
        if (numero2 > 100)
            System.out.println("el numero es grande");
        else if (numero2 < 100)
            System.out.println("el numero es chico");
        else
            System.out.println ("el numero es 100");

        System.out.println("ingrese un numero: ");
        numero3 = Utils.leerInt();
        switch (numero3){
            case 1: System.out.println ("Lunes");break;
            case 2: System.out.println ("Martes");break;
            case 3: System.out.println ("Miercoles");break;
            case 4: System.out.println ("Jueves");break;
            case 5: System.out.println ("Viernes");break;
            case 6: System.out.println ("Sabado");break;
            case 7: System.out.println ("Domingo");break;
        }
        System.out.println("Ingrese una letra: ");
        letra1 = Utils.leerChar();
        if ((letra1 >= 'a' && letra1 <= 'z') || (letra1 >= 'A' && letra1 <= 'Z')){
                switch (letra1) {
                    case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                        System.out.println("es vocal");
                        break;
                    default:
                        System.out.println("es consonante");
                }
        }
        System.out.println("ingrese el primer numero: ");
        num1 = Utils.leerInt();
        System.out.println("ingrese el segundo numero: ");
        num2 = Utils.leerInt();
        System.out.println("ingrese el tercer numero: ");
        num3 = Utils.leerInt();

        if ((num1 > num2) && (num2 > num3))
        System.out.println ("el numero es decreciente");
        else if ((num3 > num2) && (num2 > num1))
        System.out.println ("el numero es creciente");
        else
            System.out.println("error");
        }

}
