public class tp3_ej8 {
    //Escribir un programa que simule 1000 lanzamientos de un dado
    //y muestre por pantalla cuántas veces salió el valor del dado
    //correspondiente al número entero N ingresado por el usuario.
    //Considerar que el valor N ingresado se corresponda a un valor
    //posible para un dado. Usar la sentencia Math.random() que
    //devuelve un valor aleatorio real entre 0 y 1.
    //Para asignar un posible valor a la variable dado entero:
    //dado = (int) (6*Math.random() + 1)
    public static int numValidation (){
        int num = 0;
        while (!(num >= 1 && num <= 6)){
            System.out.println("ingrese un numero: ");
            num = Utils.leerInt();
        }
        return num;
    }
    public static void lanzamientos (){
        int tiradas;
        int num = numValidation();
        int dado = 0;
        int cantidad = 0;
        for (tiradas = 0; tiradas < 1000; tiradas++){
            dado = (int) (6*Math.random() + 1);
            if (num == dado){
                cantidad += 1;
            }
        }
        System.out.println("veces que salio el numero: "+cantidad);
    }
    public static void main(String[] args) {
        System.out.println("¿Deseás tirar el dado?");
        System.out.println("\tSí: '1'\tNo: '2'");
        int opcion = Utils.leerInt();

        while (opcion == 1) {
            lanzamientos();
            System.out.println("¿Deseás volver a tirar?");
            System.out.println("\tSí: '1'\tNo: '2'");
            opcion = Utils.leerInt();
        }

        System.out.println("Hasta luego");
    }

}

