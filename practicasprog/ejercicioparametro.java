public class ejercicioparametro {
    public static final int Max = 10;

    public static char opcionCaracter() {
        char oc = 'c';
        while (!(oc == 'a' || oc == 'b')) {
            System.out.println("ingrese el caracter a o b para continuar: ");
            oc = Utils.leerChar();
        }
        return oc;
    }
        public static int obtenerNum () {
            int numeroValido = Max+1;
            while (numeroValido > Max) {
                System.out.println("ingrese un numero: ");
                numeroValido = Utils.leerInt();
            }
            return numeroValido;
        }
        public static void main (String[]args){
            int n, m = 0;
            char opcionElegida = ' ';
            opcionElegida = opcionCaracter();
            n = obtenerNum();
            m = obtenerNum();
            if (opcionElegida == 'a') {
                System.out.println("la suma es " + (n+m));
            }else{
                System.out.println ("la resta es: "+ (n-m));
            }

        }
}

