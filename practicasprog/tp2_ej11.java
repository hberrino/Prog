public class tp2_ej11 {
    public static void main(String[] Args){
        //Escribir un programa que mientras el usuario ingrese un
        //caracter letra minúscula, acumule la cantidad de vocales que
        //ingresó. Finalmente muestre por pantalla dicha cantidad.
        char letra = ' ';
        int num_voc = 0;
        System.out.println ("ingrese una letra minuscula: ");
        letra = Utils.leerChar();
        while (letra >= 'a' && letra <= 'z'){
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                num_voc++;
            }
            System.out.println ("ingrese letra muniscula nuevamente: ");
            letra = Utils.leerChar();
        }
    System.out.println("has ingresado: " + num_voc + " " + "vocales");
    }
}