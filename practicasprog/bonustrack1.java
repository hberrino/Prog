public class bonustrack1 {
    public static void main(String[] args){
        //04/04/23 - 18:55 Ticket Nro. 3455674
        //CUIT: 99-34567833-9
        //Cajero: Luis Mercado Caja: 8
        //DNI: 33.333.333 “El precio lo pone el cliente”
        String cuit;
        String cajero;
        int caja;
        String dni;
        int fecha1, fecha2, fecha3;
        int hora, minutos;
        int ticket;

        System.out.println ("ingrese la fecha numerica de hoy. Dia: ");
        fecha1 = Utils.leerInt();
        System.out.println ("ingrese el mes actual: ");
        fecha2 = Utils.leerInt();
        System.out.println ("ingrese el año: ");
        fecha3 = Utils.leerInt();
        System.out.println ("ingrese la hora: ");
        hora = Utils.leerInt();
        System.out.println ("ingrese los minutos: ");
        minutos = Utils.leerInt();
        System.out.println ("ingrese su cuit: ");
        cuit = Utils.leerString();
        System.out.println ("nombre del cajero: ");
        cajero = Utils.leerString();
        System.out.println ("ingrese su dni: ");
        dni = Utils.leerString();
        System.out.println ("ingrese el numero de caja: ");
        caja = Utils.leerInt();
        System.out.println ("numero de ticket: ");
        ticket = Utils.leerInt();

        System.out.println (fecha1+"/"+fecha2+"/"+fecha3+" - "+hora+":"+minutos+" "+(" Ticket nro.: "+ticket));
        System.out.println ("CUIT: "+cuit);
        System.out.println ("Cajero: "+cajero+" "+"Caja: "+caja);
        System.out.println ("DNI: "+dni+" "+" "+"El precio lo pone el cliente");






    }

}
