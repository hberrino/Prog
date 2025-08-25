public class tpr3_ej9 {
    //Realizar un programa que, dada una opción entera (1,2,3,4),
    //permita realizar operaciones entre tres números reales (r1,r2,r3)
    //ingresados desde teclado. Para la opción:
    //1. Calcular la raíz cuadrada de (r1-r3)
    //2. Calcular el promedio de r1, r2 y r3
    //3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
    //r1
    //4. Calcular el cociente del promedio de los tres valores dividido
    //por la raíz cuadrada de r2
    //Observación: La raíz cuadrada de un número se calcula con la
    //sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
    //y de la modularización para la solución. Tener en cuenta posibles
    //errores o excepciones como la división por cero.
    public static double realesIngresados (double ingreso){
        ingreso = Utils.leerDouble();
        return ingreso;
    }
    public static int opcionElegida() {
        System.out.println("Elija una opción: "+'\n'+"1,2,3,4");
        int opcion = Utils.leerInt();
        while (opcion < 1 || opcion > 4) {
            System.out.println("Opción inválida"+'\n'+"1,2,3,4");
            opcion = Utils.leerInt();
        }
        return opcion;
    }
    public static void calculoRaiz (){
        double r1=0,r2=0,r3=0;
        System.out.println("ingrese 3 numero reales: ");
        r1 = realesIngresados(r1);
        r2 = realesIngresados(r2);
        r3 = realesIngresados(r3);

        int opcion = opcionElegida();
        if (opcion == 1){
            System.out.println("resultado: "+Math.sqrt(r1 - r3));
        }else if (opcion == 2){
            System.out.println("el promedio es: "+((r1+r2+r3)/3));
        }else if (opcion == 3){
            System.out.println("el cociente es: "+Math.sqrt(r3-r2)/r1);
        }else if (opcion == 4) {
            System.out.println("el cociente es: "+((r1+r2+r3)/3)/Math.sqrt(r2));
        }
    }
    public static void main (String[] args){
        calculoRaiz();
    }
}
