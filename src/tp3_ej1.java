public class tp3_ej1 {
    public static final int MAX = 4;
    //Hacer un método que dado un número entero con valor inicial 1,
    //haga una iteración incrementando el número de a uno hasta un
    //valor MAX = 4 (constante). Mientras itera deberá imprimir el
    //número. Luego invocarlo desde el programa principal y cuando
    //termina, imprimir por pantalla “terminó”.
    public static void ingresoNum (){
        int numero;
        for (numero = 1; numero <= MAX; numero++){
            System.out.println(numero);
        }
    }
    public static void main (String[] args){
        ingresoNum();
        System.out.println("termino");
    }
}
