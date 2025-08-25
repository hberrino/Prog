public class tp2_ej2 {
    public static void main(String[] args) {
        int mes;
        int anio;

        System.out.println("ingrese un numero de mes: ");
        mes = Utils.leerInt();

        if (mes == 2) {
            System.out.println("ingrese el año: ");
            anio = Utils.leerInt();
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
                System.out.println("el año tiene 28 dias");
            else
                System.out.println("el año tiene 29 dias");
        } else if (mes <= 12 && mes >= 1) {
            switch (mes) {
                case 4, 6, 9, 11:
                    System.out.println("el mes tiene 30 dias");
                    break;
                case 1, 3, 5, 7, 10, 12:
                    System.out.println("el mes tiene 31 dias");
                    break;
            }

        }

    }
}