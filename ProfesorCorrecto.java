import java.util.List;

public class ProfesorCorrecto extends PersonaCorrecta {
    String nombreProfesor; //Nombre de la variable mas explicito.
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos; //Creacion de la clase 'Prestamo' ya que no venia incluida.

    public ProfesorCorrecto(int numTelefono) {
        super(numTelefono);
    }


    public void printInformacionPersonal() {
        System.out.println("Nombre: " + nombreProfesor);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de telefono: " + numeroDeTelefono);
    }

    //Implementacion del metodo 'toString'.
    @Override
    public String toString() {
        return "ProfesorCorrecto{" +
                "nombreProfesor='" + nombreProfesor + '\'' +
                ", edad=" + edad +
                ", numeroDeTelefono='" + numeroDeTelefono + '\'' +
                ", prestamos=" + prestamos +
                '}';
    }
}
