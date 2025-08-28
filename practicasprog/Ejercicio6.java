public class Ejercicio6 {
    public static void main(String[] args){
//Escribir un programa que pida se ingresen datos necesarios para
//emitir una factura por la compra de dos artículos de librería (tipo
//factura, número, nombre cliente, producto 1, importe 1, producto 2,
//importe 2, importe total)
        char factura;
        int num_factura;
        String nombrecliente;
        String producto1;
        String producto2;
        double costo1;
        double costo2;
        double c_total;

        System.out.println ("Ingrese si requiere factura A, B, o C: ");
        factura = Utils.leerChar();
        System.out.println("Numero de factura: ");
        num_factura = Utils.leerInt();
        System.out.println("Su nombre por favor: ");
        nombrecliente = Utils.leerString();
        System.out.println("Ingrese el nombre del producto: ");
        producto1 = Utils.leerString();
        System.out.println("Ingrese el costo del mismo: ");
        costo1 = Utils.leerDouble();
        System.out.println("Ingrese nombre del producto: ");
        producto2 = Utils.leerString();
        System.out.println("Ingrese costo del mismo: ");
        costo2 = Utils.leerDouble();
        c_total = costo1+costo2;

        System.out.println("Factura: "+" "+" "+factura+" "+" "+"N "+num_factura);
        System.out.println("Nombre: "+nombrecliente);
        System.out.println("Producto "+" "+" "+" "+"Importe");
        System.out.println(producto1+" "+" "+" "+costo1+"\n"+producto2+" "+" "+" "+costo2+"\n"+"Importe total: "+c_total);

    }
}
