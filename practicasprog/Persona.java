public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String fecha;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(int dni) {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.fecha = "01/01/2000";
        this.sexo = "Femenino";
        this.peso = 1;
        this.altura = 1;
        this.edad = 0;
    }
    public Persona(int dni, String nombre, String apellido){
        this(dni);
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona (int dni, String nombre, String apellido, String fecha){
        this(dni, nombre, apellido);
        this.fecha = fecha;
    }
    public Persona (int dni, String nombre, String apellido, String fecha, String sexo){
        this(dni, nombre, apellido, fecha);
        this.sexo = sexo;
    }
    public Persona (int dni, String nombre, String apellido, String fecha, String sexo, double peso){
        this (dni, nombre, apellido, fecha, sexo);
        this.peso = peso;
    }
    public Persona (int dni, String nombre, String apellido, String fecha, String sexo, double peso, double altura){
        this (dni, nombre, apellido, fecha, sexo, peso);
        this.altura = altura;
    }
    public Persona(int dni, String nombre, String apellido, String fecha, String sexo, double peso, double altura, int edad) {
        this(dni, nombre, apellido, fecha, sexo, peso, altura);
        this.edad = edad;
    }
    public void setApellido(String nuevoApellido) {
        apellido = nuevoApellido;
    }
    public String getApellido (){
        return apellido;
    }
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }
    public int getEdad() {
        return edad;
    }
    public void setFecha (String nuevaFecha){
        fecha=nuevaFecha;
    }
    public String getFecha (){
        return fecha;
    }
    public void setSexo (String nuevoSexo){
        sexo=nuevoSexo;
    }
    public String getSexo (){
        return sexo;
    }
    public void setPeso (double nuevoPeso){
        peso = nuevoPeso;
    }
    public double getPeso (){
        return peso;
    }
    public void setAltura (double nuevaAltura){
        altura=nuevaAltura;
    }
    public double getAltura(){
        return altura;
    }
    //calcular indice de masa corporal (peso / altura2)
    public double calcularIMC (){
        if (altura<=0){
            return 0;
        }
        return peso/(altura*altura);
    }
    public boolean buenaForma() {
        return calcularIMC() >= 18.5 && calcularIMC() <= 25;
    }
    public boolean esSuCumple() {
        String diaNacimiento = fecha.substring(0, 2);   // primeros 2 caracteres
        String mesNacimiento = fecha.substring(3, 5);   // caracteres 3 y 4

        String diaHoy = "20"; //día y mes de hoy
        String mesHoy = "08";

        // comparar día y mes
        return diaNacimiento.equals(diaHoy) && mesNacimiento.equals(mesHoy);
    }
    public boolean esMayor() {
        return edad >= 18;
    }
    public boolean puedeVotar() {
       return edad >= 16;
    }
    public boolean coincideEdad() {
        String anio = fecha.substring(6, 10);
        int anioNacimiento = Integer.parseInt(anio); //año de string a numero

        int edadSegunAnio = 2025 - anioNacimiento;

        return edadSegunAnio == edad;
    }
    public String mostrarInfo() {
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Edad: " + edad + "\n" +
                "Fecha de nacimiento: " + fecha + "\n" +
                "DNI: " + dni + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + "\n" +
                "Altura: " + altura + "\n" +
                "IMC: " + calcularIMC() + "\n" +
                "En buena forma: " + (buenaForma() ? "Sí" : "No") + "\n" +
                "Puede votar: " + (puedeVotar() ? "Sí" : "No") + "\n" +
                "Es mayor de edad: " + (esMayor() ? "Sí" : "No") + "\n" +
                "Coincide edad y fecha: " + (coincideEdad() ? "Sí" : "No") + "\n" +
                "Es su cumpleaños hoy: " + (esSuCumple() ? "Sí" : "No");
    }
    public static void main(String[] args) {
        // Crear objeto de tipo Persona
        Persona persona1 = new Persona(12345678);
        Persona persona2 = new Persona (23456788, "Juan", "Rodriguez", "07/05/2000", "masculino", 70, 1.50, 23);
        System.out.println(persona2.mostrarInfo());
    }
}
