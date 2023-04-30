import java.util.List;

public class ProfesorIncorrecto extends PersonaIncorrecta {
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos; // Creacion de la clase 'Prestamo' ya que no venia incluida.

    public ProfesorIncorrecto(String numeroTelefono) {
        super(numeroTelefono);
    }

    public void printInformacionPersonal() {
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de telefono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion() {
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de telefono: " + this.numeroDeTelefono);
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}
